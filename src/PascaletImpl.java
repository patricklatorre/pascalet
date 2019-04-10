import debug.Debug;
import gen.*;
import symbolTable.VariableModel;
import symbolTable.VariableTable;
import errorManager.Error;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


/* NOTES */


public class PascaletImpl extends PascaletBaseVisitor<String> {

    // symbol table of global variables
    VariableTable globals = new VariableTable();

    // "stack" of scopes for all variables
    Stack<VariableTable> scopes = new Stack<>();

    // becomes true once detected that global declaration block is finished
    boolean lockGlobalDeclarations = false;

    public final String UNINITIALIZED_VAR = "$UNINITIALIZED_VAR";


    // Initialization of program
    @Override
    public String visitProgram(PascaletParser.ProgramContext ctx) {
        // some initializers here
        Debug.run = true;
        addSymbolTable();

        return super.visitProgram(ctx);
    }


    // just for locking global declarations
    @Override
    public String visitProcedureAndFunctionDeclarationPart(PascaletParser.ProcedureAndFunctionDeclarationPartContext ctx) {
        lockGlobalDeclarations = true;
        return super.visitProcedureAndFunctionDeclarationPart(ctx);
    }

    // just for locking global declarations
    @Override
    public String visitCompoundStatement(PascaletParser.CompoundStatementContext ctx) {
        lockGlobalDeclarations = true;
        return super.visitCompoundStatement(ctx);
    }
























    // Evaluate function call
    @Override
    public String visitProcedureStatement(PascaletParser.ProcedureStatementContext ctx) {
        // If built in function, execute
        String procedureName = ctx.identifier().IDENT().toString();

        // readln()
        if (procedureName.equalsIgnoreCase("readln")) {
            readln(ctx);
        }

        // writeln()
        else if (procedureName.equalsIgnoreCase("writeln")) {
            writeln(ctx);
        }

        return super.visitProcedureStatement(ctx);
    }



















    // For JUST declaring variables: NAME & TYPE
    // var x: String;
    @Override
    public String visitVariableDeclaration(PascaletParser.VariableDeclarationContext ctx) {
        // Get list of variables declared
        List<PascaletParser.IdentifierContext> varNames = ctx.identifierList().identifier();

        // Get declared type
        String varType = visit(ctx.type());

        // iterate through variable names (for multiple declaration)
        for (int i = 0; i < varNames.size(); i++) {
            String varName = varNames.get(i).getText();

            if (queryVariableScope(varName) != null) {
                Error.varAlreadyDeclared(varName, ctx);
                System.exit(1);
            }

            // store to global/local symbol table
            if (lockGlobalDeclarations) {
                addVariable(varName, UNINITIALIZED_VAR, varType);
            } else {
                addGlobalVariable(varName, UNINITIALIZED_VAR, varType);
            }
        }
        return super.visitVariableDeclaration(ctx);
    }

















    // Assigning a value to a variable
    @Override
    public String visitAssignmentStatement(PascaletParser.AssignmentStatementContext ctx) {
        String varName = ctx.variable().identifier(0).getText();

        // if var doesn't exist throw error
        VariableTable scopeOfVar = queryVariableScope(varName);
        if (scopeOfVar == null) {
            Error.cantResolveIden(varName, ctx);
            System.exit(1);
        }

        String preValue = visit(ctx.expression());
        String value = (preValue == null) ? "NIL" : preValue;

        // compare if value data type is compatible with variable data type
        String storedType = scopeOfVar.typeOf(varName);
        String inferredType = inferType(value);

        // throw error if types mismatch
        if (!storedType.equalsIgnoreCase(inferredType)) {
            Error.invalidAssignment(storedType, inferredType, ctx);
            System.exit(1);
        }

        // update var value if valid
        scopeOfVar.assign(varName, value);

        return super.visitAssignmentStatement(ctx);
    }














    @Override
    public String visitIfStatement(PascaletParser.IfStatementContext ctx) {
        // evaluate expression right away
        String evaluatedExpression = visit(ctx.expression());

        // check if expression yields a boolean
        if (!isBoolean(evaluatedExpression)) {
            Error.invalidCondition(inferType(evaluatedExpression), ctx);
            System.exit(1);
        }

        boolean expressionResult = Boolean.parseBoolean(evaluatedExpression);

        if (expressionResult) {
            visit(ctx.statement(0));
            return "";
        } else {
            visit(ctx.statement(1));
            return "";
        }
    }

    // evaluate expressions wrapped in ()
    @Override
    public String visitFactor(PascaletParser.FactorContext ctx) {
        // check if contains not
        if (ctx.NOT() != null) {
            return ""+ !Boolean.parseBoolean(visit(ctx.factor()));
        }

        // check if wrapped in ()
        if (ctx.LPAREN() != null && ctx.RPAREN() != null) {
            return visit(ctx.expression());
        }
        return super.visitFactor(ctx);
    }














    @Override
    public String visitForStatement(PascaletParser.ForStatementContext ctx) {
        return super.visitForStatement(ctx);
    }
    















    // VISIT() logic --  used for getting identifier string
    @Override
    public String visitIdentifier(PascaletParser.IdentifierContext ctx) {
        return ctx.IDENT().getText();
    }

    // VISIT() logic -- used for getting type string
    @Override
    public String visitType(PascaletParser.TypeContext ctx) {
        return ctx.simpleType().typeIdentifier().getText();
    }



















    // return VALUE of variable everytime variable is mentioned in code
    @Override
    public String visitVariable(PascaletParser.VariableContext ctx) {
        // get the var name and retrieve its corresponding symbol table
        String varName = ctx.identifier().get(0).getText();
        VariableTable scopeOfVar = queryVariableScope(varName);

        // throw error if var not found
        if (queryVariableScope(varName) == null) {
            Error.cantResolveIden(varName, ctx);
            System.exit(1);
        }

        // return the value of the var
        return scopeOfVar.get(varName).getValue();
    }
















    // return UNSIGNED NUMBERS as a string
    @Override
    public String visitUnsignedNumber(PascaletParser.UnsignedNumberContext ctx) {
        return ctx.getText();
    }

    // return STRINGS as a string
    @Override
    public String visitString(PascaletParser.StringContext ctx) {
        return ctx.getText();
    }

    // return BOOLEANS as a string
    @Override
    public String visitBool(PascaletParser.BoolContext ctx) {
        return ctx.getText();
    }

    // return
    @Override
    public String visitUnsignedConstant(PascaletParser.UnsignedConstantContext ctx) {
        return ctx.getText();
    }

    // return as signed integer if integer, if not continue as is
    @Override
    public String visitSignedFactor(PascaletParser.SignedFactorContext ctx) {
        // evaluate the factor
        String evaluatedFactor = visit(ctx.factor());

        // if no sign treat as positive
        if (ctx.PLUS() == null && ctx.MINUS() == null) {
            return evaluatedFactor;
        }

        // if signed as plus, treat as unsigned
        else if (ctx.PLUS() != null) {
            // throw error if not integer
            if (!isInteger(evaluatedFactor)) {
                Error.invalidOperandType(evaluatedFactor, ctx);
                System.exit(1);
            }
            return evaluatedFactor;
        }

        // negate if signed otherwise
        else {
            // throw error if not integer
            if (!isInteger(evaluatedFactor)) {
                Error.invalidOperandType(evaluatedFactor, ctx);
                System.exit(1);
            }
            int factorAsInt = Integer.parseInt(evaluatedFactor);
            return ""+ (factorAsInt * -1);
        }
    }











    // relational operations
    @Override
    public String visitExpression(PascaletParser.ExpressionContext ctx) {
        // Get left operand
        String left = visit(ctx.simpleExpression());

        // Store relop context to null check
        PascaletParser.RelationaloperatorContext relopContext = ctx.relationaloperator();

        // if no relational operator is found, continue as is
        if (relopContext == null) {

            return super.visitExpression(ctx);

        } else {

            // since valid, get relop string
            String relop = relopContext.getText().toLowerCase();

            // Get right operand
            String right = visit(ctx.expression());


            // evaluate based on operand data type (BREAK will throw an InvalidOperation error)
            // Check first if integers >> else check if booleans >> else treat as strings
            switch (relop) {

                // GREATER THAN
                case ">":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) > Integer.parseInt(right));
                    } else if (booleanExists(left, right)) {
                        break;
                    } else {
                        return ""+ (left.length() > right.length());
                    }

                // LESS THAN
                case "<":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) < Integer.parseInt(right));
                    } else if (booleanExists(left, right)) {
                        break;
                    } else {
                        return ""+ (left.length() < right.length());
                    }

                // GREATER THAN OR EQUAL
                case ">=":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) >= Integer.parseInt(right));
                    } else if (booleanExists(left, right)) {
                        break;
                    } else {
                        return ""+ (left.length() >= right.length())    ;
                    }

                // LESS THAN OR EQUAL
                case "<=":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) <= Integer.parseInt(right));
                    } else if (booleanExists(left, right)) {
                        break;
                    } else {
                        return ""+ (left.length() <= right.length());
                    }

                // EQUAL
                case "=":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) == Integer.parseInt(right));
                    } else if (booleanExists(left, right)) {
                        return ""+ (Boolean.parseBoolean(left) == Boolean.parseBoolean(right));
                    } else {
                        return ""+ (left.length() == right.length());
                    }

                // NOT EQUAL
                case "<>":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) != Integer.parseInt(right));
                    } else if (booleanExists(left, right)) {
                        return ""+ (Boolean.parseBoolean(left) != Boolean.parseBoolean(right));
                    } else {
                        return ""+ (left.length() != right.length());
                    }
            }

            // throw exception if invalid operator
            Error.invalidOperator(relop, ctx);
            System.exit(1);
        }
        return super.visitExpression(ctx);
    }


    // additive operations
    @Override
    public String visitSimpleExpression(PascaletParser.SimpleExpressionContext ctx) {
        // Get left operand
        String left = visit(ctx.term());

        // Store additive context to null check
        PascaletParser.AdditiveoperatorContext additiveContext = ctx.additiveoperator();

        // if no additive operator is found, continue as is
        if (additiveContext == null) {

            return super.visitSimpleExpression(ctx);

        } else {

            // since valid, get additive string
            String addop = additiveContext.getText().toLowerCase();

            // Get right operand
            String right = visit(ctx.simpleExpression());


            // evaluate based on operand data type (BREAK will throw an InvalidOperation error)
            // Check first if integers >> else check if booleans >> else treat as strings
            switch (addop) {

                // PLUS
                case "+":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) + Integer.parseInt(right));
                    } else if (booleanExists(left, right)) {
                        break;
                    } else {
                        return left + right;
                    }

                // MINUS
                case "-":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) - Integer.parseInt(right));
                    } else if (booleanExists(left, right)) {
                        break;
                    } else {
                        break;
                    }

                // OR
                case "or":
                    if (areBothIntegers(left, right)) {
                        break;
                    } else if (areAllBooleans(left, right)) {
                        return ""+ (Boolean.parseBoolean(left) || Boolean.parseBoolean(right));
                    } else {
                        break;
                    }
            }

            // throw if invalid operator
            Error.invalidOperator(addop, ctx);
            System.exit(1);
        }
        return super.visitSimpleExpression(ctx);
    }


    // multiplicative operations
    @Override
    public String visitTerm(PascaletParser.TermContext ctx) {
        // Get left operand
        String left = visit(ctx.signedFactor());

        // Store additive context to null check
        PascaletParser.MultiplicativeoperatorContext multiContext = ctx.multiplicativeoperator();

        // if no multiplicative operator is found, continue as is
        if (multiContext == null) {

            return super.visitTerm(ctx);

        } else {

            // since valid, get additive string
            String multop = multiContext.getText().toLowerCase();

            // Get right operand
            String right = visit(ctx.term());


            // evaluate based on operand data type (BREAK will throw an InvalidOperation error)
            // Check first if integers >> else check if booleans >> else treat as strings
            switch (multop) {
                // MULTIPLY
                case "*":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) * Integer.parseInt(right));
                    } else if (booleanExists(left, right)) {
                        break;
                    } else {
                        break;
                    }

                // DIVIDE
                case "/":
                    if (areBothIntegers(left, right)) {
                        int dividend = Integer.parseInt(left);
                        int divisor = Integer.parseInt(right);

                        // throw error if dividing by zero
                        if (divisor == 0) {
                            Error.divByZero(ctx);
                            System.exit(1);
                        }

                        return ""+ (dividend/divisor);
                    } else if (booleanExists(left, right)) {
                        break;
                    } else {
                        break;
                    }

                // MODULO
                case "mod":
                    if (areBothIntegers(left, right)) {
                        return ""+ (Integer.parseInt(left) % Integer.parseInt(right));
                    } else if (areAllBooleans(left, right)) {
                        break;
                    } else {
                        break;
                    }

                // AND
                case "and":
                    if (areBothIntegers(left, right)) {
                        break;
                    } else if (areAllBooleans(left, right)) {
                        return ""+ (Boolean.parseBoolean(left) && Boolean.parseBoolean(right));
                    } else {
                        break;
                    }
            }
            Error.invalidOperator(multop, ctx);
            System.exit(1);
        }
        return super.visitTerm(ctx);
    }



    // writeln() logic
    private void writeln(PascaletParser.ProcedureStatementContext ctx) {
        List<PascaletParser.ActualParameterContext> parameters = ctx.parameterList().actualParameter();
        for (PascaletParser.ActualParameterContext param : parameters) {
            System.out.println(visit(param));
        }
    }

















    // readln() logic
    private void readln(gen.PascaletParser.ProcedureStatementContext ctx) {
        // always add a new symbol table for function call
        Scanner in = new Scanner(System.in);

        if (Debug.run) addVariable("magicVar", "voila", "string");

        // iterate through the parameters and scan per parameter
        List<PascaletParser.ActualParameterContext> parameters = ctx.parameterList().actualParameter();
        for (int i = 0; i < parameters.size(); i++) {
            String parameterName = parameters.get(i).getText();

            // get last table where var was mentioned
            VariableTable scopeOfVar = queryVariableScope(parameterName);

            // if null, variable not mentioned before
            if (scopeOfVar == null) {
                Error.cantResolveIden(parameterName, ctx);
                System.exit(1);
            }

            // scan parameters to console
            VariableModel queriedVar = scopeOfVar.get(parameterName);
            scopeOfVar.add(parameterName, in.nextLine(), queriedVar.getType());
        }
    }










    /////////////////////////////////// HELPER METHODS ////////////////////////////////////////




    // Get the last table of last scope where a certain var is mentioned
    private VariableTable queryVariableScope(String variableName) {
        // check current symbol table if variable is declared
        if (currentSymTable().contains(variableName)) return currentSymTable();

        // check global symbol table if variable is declared
        if (globals.contains(variableName)) return globals;

        // null if variable not found
        return null;
    }



    // return current symbol table
    private VariableTable currentSymTable() {
        return scopes.peek();
    }


    // add a new symbol table to stack
    private void addSymbolTable() {
        scopes.push(new VariableTable());
        Debug.note("NewScope", "");
    }


    // remove last symbole table
    private void popSymbolTable() {
        scopes.pop();
        Debug.note("EndScope", "");
    }


    // add a new variable in the TOP symbol table
    private void addVariable(String name, String value, String type) {
        currentSymTable().add(name, value, type);
    }


    // add a global variable
    private void addGlobalVariable(String name, String value, String type) {
        globals.add(name, value, type);
    }

    private boolean isInteger(String integer) {
        return integer.matches("-?\\d+(\\.\\d+)?");
    }

    // check if string is boolean
    private boolean isBoolean(String bool) {
        return bool.equalsIgnoreCase("true") || bool.equalsIgnoreCase("false");
    }

    // checks if list of strings has a boolean
    private boolean booleanExists(String ... args) {
        for (String arg : args)
            if (isBoolean(arg)) return true;
        return false;
    }

    // checks if list of strings are all booleans
    private boolean areAllBooleans(String ... args) {
        for (String arg : args)
            if (!isBoolean(arg)) return false;
        return true;
    }

    // checks if list of strings are both integers
    private boolean areBothIntegers(String ... args) {
        for (String arg : args)
            if (!isInteger(arg)) return false;
        return true;
    }

    // infer the type as a string
    private String inferType(String value) {
        if (isInteger(value))
            return "integer";
        else if (isBoolean(value))
            return "boolean";
        else
            return "string";
    }

}

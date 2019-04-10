import debug.Debug;
import gen.*;
import symbolTable.VariableModel;
import symbolTable.VariableTable;
import errorManager.Error;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;


/* NOTES */


public class PascaletImpl extends PascaletBaseVisitor<Double> {

    // symbol table of global variables
    VariableTable globals = new VariableTable();

    // "stack" of scopes for all variables
    Stack<VariableTable> scopes = new Stack<>();

    // becomes true once detected that global declaration block is finished
    boolean lockGlobalDeclarations = false;

    public final String UNINITIALIZED_VAR = "$UNINITIALIZED_VAR";







    // Initialization of program
    @Override
    public Double visitProgram(PascaletParser.ProgramContext ctx) {
        // some initializers here
        Debug.run = true;
        addSymbolTable();

        return super.visitProgram(ctx);
    }










    // just for locking global declarations
    @Override
    public Double visitProcedureAndFunctionDeclarationPart(PascaletParser.ProcedureAndFunctionDeclarationPartContext ctx) {
        lockGlobalDeclarations = true;
        return super.visitProcedureAndFunctionDeclarationPart(ctx);
    }

    // just for locking global declarations
    @Override
    public Double visitCompoundStatement(PascaletParser.CompoundStatementContext ctx) {
        lockGlobalDeclarations = true;
        return super.visitCompoundStatement(ctx);
    }










    // Evaluate function call
    @Override
    public Double visitProcedureStatement(PascaletParser.ProcedureStatementContext ctx) {
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
    // var x: Integer;
    @Override
    public Double visitVariableDeclaration(PascaletParser.VariableDeclarationContext ctx) {
        // Get list of variables declared
        List<PascaletParser.IdentifierContext> varNames = ctx.identifierList().identifier();

        // Get declared type
        // TODO: NOT SURE IF WORKING
        String varType = ctx.type().simpleType().typeIdentifier().getText();

        // iterate through variable names (for multiple declaration)
        for (int i = 0; i < varNames.size(); i++) {
            String varName = varNames.get(i).getText();

            if (queryVariableScope(varName) != null) {
                Error.varAlreadyDeclared(varName, ctx.getStart().getLine());
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
    public Double visitAssignmentStatement(PascaletParser.AssignmentStatementContext ctx) {
        String varName = ctx.variable().identifier().get(0).getText();

        // if var doesn't exist
        VariableTable scopeOfVar = queryVariableScope(varName);
        if (scopeOfVar == null) {
            Error.cantResolveIden(varName, ctx.getStart().getLine());
            System.exit(1);
        }

        // TODO: only stores numbers and strings (still needs expressions)
        String value = ctx.expression().simpleExpression().term().signedFactor().factor().getText();

        scopeOfVar.assign(varName, value);

        return super.visitAssignmentStatement(ctx);
    }






















    // writeln() logic
    private void writeln(PascaletParser.ProcedureStatementContext ctx) {
        // TODO: do visit expression before this
    }










    // readln() logic
    private void readln(gen.PascaletParser.ProcedureStatementContext ctx) {
        // always add a new symbol table for function call
        addSymbolTable();

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
                Error.cantResolveIden(parameterName, ctx.getStart().getLine());
                System.exit(1);
            }

            // scan parameters to console
            VariableModel queriedVar = scopeOfVar.get(parameterName);
            scopeOfVar.add(parameterName, in.nextLine(), queriedVar.getType());
        }

        // always pop last table when done with scope
        popSymbolTable();
    }










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
    }






    // remove last symbole table
    private void popSymbolTable() {
        scopes.pop();
        Debug.note("PopSymTable", "");
    }







    // add a new variable in the TOP symbol table
    private void addVariable(String name, String value, String type) {
        currentSymTable().add(name, value, type);
    }






    // add a global variable
    private void addGlobalVariable(String name, String value, String type) {
        globals.add(name, value, type);
    }
}

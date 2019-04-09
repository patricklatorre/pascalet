import gen.PascaletBaseVisitor;
import gen.PascaletParser;
import symbolTable.VariableModel;
import symbolTable.VariableTable;
import errorManager.Error;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* NOTES */
/* TODO: to get line of token ctx.getStart().getLine() */


public class PascaletImpl extends PascaletBaseVisitor<Double> {

    // "stack" of scopes for all variables
    List<VariableTable> scopes = new ArrayList<>();





    // Evaluate function call
    @Override
    public Double visitProcedureStatement(gen.PascaletParser.ProcedureStatementContext ctx) {
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

    // Evaluate expression






    /*
    *
    *   HELPER METHODS
    *
    * */








    // writeln() logic
    private void writeln(PascaletParser.ProcedureStatementContext ctx) {
        // TODO: do visit expression before this
    }










    // readln() logic
    private void readln(gen.PascaletParser.ProcedureStatementContext ctx) {
        // always add a new scope for function call parameters
        scopes.add(new VariableTable());

        Scanner in = new Scanner(System.in);

        // DEBUG (store sample var)
        // addNewVar("somevar", "69", "int");

        // iterate through the parameters and scan per parameter
        List<PascaletParser.ActualParameterContext> parameters = ctx.parameterList().actualParameter();
        for (int i = 0; i < parameters.size(); i++) {
            String parameterName = parameters.get(i).getText();

            // get last table where var was mentioned
            VariableTable paramScopeOrigin = queryLastVariableInstance(parameterName);

            // if null, variable not mentioned before
            if (paramScopeOrigin == null) {
                Error.cantResolveIden(parameterName, ctx.getStart().getLine());
                System.exit(1);
                // TODO: should also quit program
            }

            // print parameters to console
            VariableModel queriedVar = paramScopeOrigin.get(parameterName);
            paramScopeOrigin.add(parameterName, in.nextLine(), queriedVar.getType());
        }
    }










    // Get the last table where a certain var is mentioned
    private VariableTable queryLastVariableInstance(String variableName) {
        for (int i = scopes.size()-1; i >= 0; i--) {
            if (scopes.get(i).contains(variableName))
                return scopes.get(i);
        }
        // return null if var not found
        return null;
    }












    // add a new variable in the TOP symbol table
    private void addNewVar(String name, String value, String type) {
        scopes.get(scopes.size()-1).add(name, value, type);
    }
}

import com.sun.org.apache.xpath.internal.operations.Variable;
import gen.PascaletBaseVisitor;
import gen.PascaletParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascaletImpl extends PascaletBaseVisitor<Double> {

    List<VariableTable> scopes = new ArrayList<>();

    @Override
    public Double visitProcedureStatement(gen.PascaletParser.ProcedureStatementContext ctx) {
        // get the param name
        System.out.print(ctx.identifier().IDENT().toString() + " := ");
        // get the param value
        System.out.println(ctx.parameterList().getText());

        // If built in function, do it

        String procedureName = ctx.identifier().IDENT().toString();
        if (procedureName.equalsIgnoreCase("readln")) {

        }

        return super.visitProcedureStatement(ctx);
    }

    // helper methods
    private void readln(gen.PascaletParser.ProcedureStatementContext ctx) {
        scopes.add(new VariableTable());

        Scanner in = new Scanner(System.in);

        // iterate through the parameters and scan per parameter
        List<PascaletParser.ActualParameterContext> parameters = ctx.parameterList().actualParameter();
        for (int i = 0; i < parameters.size(); i++) {
            String parameterName = parameters.get(i).getText();

            // get last table where var was mentioned
            VariableTable lastVarTable = queryLastVariableInstance(parameterName);

            // TODO: handle this error
            // if null, variable not mentioned before
            if (lastVarTable == null) {
                // handle error here
                System.out.println("Variable " + parameterName + " does not exist.");
            }

            // scan on console per parameter
            VariableModel variableModel = lastVarTable.get(parameterName);
            lastVarTable.add(parameterName, in.nextLine(), variableModel.getType());
        }
    }

    /* Get the last table where a certain var is mentioned */
    private VariableTable queryLastVariableInstance(String variableName) {
        for (int i = scopes.size()-1; i >= 0; i--) {
            if (scopes.get(i).contains(variableName))
                return scopes.get(i);
        }
        return null;
    }

}

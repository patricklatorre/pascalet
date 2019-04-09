public class Write {
    @Override
    public Integer visitProcedureStatement(APascaletParser.ProcedureStatementContext ctx) {

//        System.out.println(ctx.identifier().getText());
//        ArrayList<Object> parameters = evaluateParameterList(ctx.parameterList());


        List<APascaletParser.ActualParameterContext> tempParam = ctx.parameterList().actualParameter();
        String[] param = new String[tempParam.size()];
        for (int i = 0; i < tempParam.size(); i++)
            param[i] = tempParam.get(i).getText();

//        System.out.println(ctx.parameterList().getText());
        if (ctx.identifier().getText().equalsIgnoreCase("writeln") ||
                ctx.identifier().getText().equalsIgnoreCase("write")) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < param.length; i++) {
                for (int j = 0; j < param[i].length(); j++) {
                    if (param[i].charAt(j) == '\'') {
                        do {
                            j++;

                            if (param[i].charAt(j) != '\'')
                                temp.append(param[i].charAt(j));

                        } while (param[i].charAt(j) != '\'');

                        // System.out.println(param[i].charAt(j) + " " + j + " " + param[i].length());
                        if (j != param[i].length() - 1 && param[i].charAt(j) != '+')
                            error("Syntax error | Line number - " + ctx.getStart().getLine());
                    } else {
                        //  todo add expressionParser
//                        int expression = evaluateExpression(ctx.parameterList().actualParameter(i).expression());
//                        temp.append(expression);
                    }
                }
            }



            if (ctx.identifier().getText().equalsIgnoreCase("writeln"))
                System.out.println(temp);
            else
                System.out.print(temp);
        } else {
            System.out.println(ctx.identifier().getText());
            //todo add other procedure statements (procedure function calls)
        }
        return super.visitProcedureStatement(ctx);
    }
}

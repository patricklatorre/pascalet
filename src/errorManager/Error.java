package errorManager;

import org.antlr.v4.runtime.ParserRuleContext;

public class Error {
    public static void cantResolveIden(String identifier, ParserRuleContext ctx) {
        String preset = "ERROR @ " +ctx.getStart().getLine()+ "  -----  ";
        System.out.println(preset + "Can't resolve identifier \"" + identifier + "\"");
    }

    public static void varAlreadyDeclared(String identifier, ParserRuleContext ctx) {
        String preset = "ERROR @ " +ctx.getStart().getLine()+ "  -----  ";
        System.out.println(preset + "Identifier already declared \"" + identifier + "\"");
    }

    public static void invalidOperator(String operator, ParserRuleContext ctx) {
        String preset = "ERROR @ " +ctx.getStart().getLine()+ "  -----  ";
        System.out.println(preset + operator + " is an invalid operator");
    }

    public static void invalidOperandType(String operand, ParserRuleContext ctx) {
        String preset = "ERROR @ " +ctx.getStart().getLine()+ "  -----  ";
        System.out.println(preset + operand + " is an invalid operand");
    }

    public static void invalidOperation(String operator, ParserRuleContext ctx) {
        String preset = "ERROR @ " +ctx.getStart().getLine()+ "  -----  ";
        System.out.println(preset + operator + " is an invalid operation");
    }

    public static void invalidAssignment(String expectedType, String receivedType, ParserRuleContext ctx) {
        String preset = "ERROR @ " +ctx.getStart().getLine()+ "  -----  ";
        System.out.println(preset + "Expecting " + expectedType + " but received " + receivedType);
    }

    public static void divByZero(ParserRuleContext ctx) {
        String preset = "ERROR @ " +ctx.getStart().getLine()+ "  -----  ";
        System.out.println(preset + "Division by zero");
    }

}

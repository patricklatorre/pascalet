package debug;

public class Debug {
    public static boolean run = false;
    private final static String tabs = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t";

    public static void store(String action, String name, String value, String type) {
        if (run) System.out.println(tabs + "<" + action + "> " + type + " " + name + " = " + value);
    }

    public static void note(String action, String note) {
        if (run) System.out.println(tabs + "<" + action + "> " + note);
    }

    public static void binary(String action, String op1, String operator, String op2) {
        if (run) System.out.println(tabs + "<" + action + "> " + op1 + " " +operator+ " " + op2);
    }

    public static void unary(String action, String op, String operator) {
        if (run) System.out.println(tabs + "<" + action + "> " + op + " " + operator);
    }
}

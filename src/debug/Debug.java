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

}

package errorManager;

public class Error {
    public static void cantResolveIden(String identifier, int line) {
        String preset = "ERROR @ " +line+ "  -----  ";
        System.out.println(preset + "Can't resolve identifier \"" + identifier + "\"");
    }
}

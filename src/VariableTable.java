import java.util.HashMap;

public class VariableTable {
    private HashMap<String, String> globalVars;
    // ("x", "1")
    // ("somestring", "wowee")


    private HashMap<String, String> globalTypes;
    // ("x", "int")
    // ("somestring", "1")

    public VariableTable() {
        globalVars = new HashMap<>();
        globalTypes = new HashMap<>();
    }

    public boolean contains(String name) {
        return globalVars.get(name) != null;
    }

    public void add(String name, String value, String type) {
        globalVars.put(name, value);
        globalTypes.put(name, value);
    }

    public String valueOf(String variableName) {
        return globalVars.get(variableName);
    }

    public String typeOf(String variableName) {
        return globalTypes.get(variableName);
    }

    public VariableModel get(String variableName) {
        return new VariableModel(
                variableName,
                valueOf(variableName),
                typeOf(variableName)
        );
    }
}

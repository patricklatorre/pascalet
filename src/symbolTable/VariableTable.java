package symbolTable;

import java.util.HashMap;

public class VariableTable {

    /*
    *       Example:
    *
    *       NAME        VALUE           NAME        TYPE
    *       --------------------        ----------------------
    *       x           1               x           int
    *       y           -5              y           int
    *       month       oct             month       string
    *
    * */

    private HashMap<String, String> values;
    private HashMap<String, String> types;

    public VariableTable() {
        values = new HashMap<>();
        types = new HashMap<>();
    }

    // Check if table contains variable
    public boolean contains(String name) {
        return values.get(name) != null;
    }

    // Add a new variable
    public void add(String name, String value, String type) {
        values.put(name, value);
        types.put(name, value);
    }

    // Get value of var
    public String valueOf(String variableName) {
        return values.get(variableName);
    }

    // Get type of var
    public String typeOf(String variableName) {
        return types.get(variableName);
    }

    // Get all var details (packaged as VariableModel)
    public VariableModel get(String variableName) {
        return new VariableModel(
                variableName,
                valueOf(variableName),
                typeOf(variableName)
        );
    }
}

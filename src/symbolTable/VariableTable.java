package symbolTable;

import debug.Debug;

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
        types.put(name, type);

        // Debug
        Debug.store("VariableStore", name, value, type);
    }

    // Get value of var
    public String valueOf(String variableName) {
        return values.get(variableName);
    }

    // Get type of var
    public String typeOf(String variableName) {
        return types.get(variableName);
    }

    // Get all var details (packaged as VariableModel) return null if doesn't exist
    public VariableModel get(String variableName) {
        return !contains(variableName) ? null :
                new VariableModel(
                    variableName,
                    valueOf(variableName),
                    typeOf(variableName)
                );
    }

    // overwrite variable entry in hashmap
    public void assign(String name, String value) {
        values.put(name, value);

        // Debug
        Debug.store("VariableAssign", name, value, typeOf(name));
    }
}

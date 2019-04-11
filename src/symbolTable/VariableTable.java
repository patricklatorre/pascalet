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
        return values.get(name.toLowerCase()) != null;
    }

    // Add a new variable
    public void add(String name, String value, String type) {
        values.put(name.toLowerCase(), value);
        types.put(name.toLowerCase(), type.toLowerCase());

        Debug.store("VariableStore", name.toLowerCase(), value, type.toLowerCase());
    }

    // Get value of var
    public String valueOf(String variableName) {
        return values.get(variableName.toLowerCase());
    }

    // Get type of var
    public String typeOf(String variableName) {
        return types.get(variableName.toLowerCase());
    }

    // Get all var details (packaged as VariableModel) return null if doesn't exist
    public VariableModel get(String variableName) {
        return !contains(variableName.toLowerCase()) ? null :
                new VariableModel(
                    variableName.toLowerCase(),
                    valueOf(variableName.toLowerCase()),
                    typeOf(variableName.toLowerCase())
                );
    }

    // overwrite variable entry in hashmap
    public void assign(String name, String value) {
        values.put(name.toLowerCase(), value);

        // Debug
        Debug.store("Assignment", name.toLowerCase(), value, typeOf(name.toLowerCase()));
    }

    public HashMap<String, String> getValues() {
        return values;
    }

    public HashMap<String, String> getTypes() {
        return types;
    }
}

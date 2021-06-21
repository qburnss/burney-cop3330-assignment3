package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class jsonProducts {

//read function
    public static String winsight(ArrayList<Map<String, Object>> array, String name) {
        for (Map<String, Object> qc : array) {
            //get product name, display info if its a match
            String qcName = (String) qc.get("name");
            if (qcName.equalsIgnoreCase(name)) {
               //return String.format("Name: " + name + "\nPrice: %.2f" + qc.get("price") + "\nQuantity: " + qc.get("quantity"));
                return String.format("Name: %s\nPrice: %.2f\nQuantity: %d%n", qc.get("name"), qc.get("price"), qc.get("quantity"));
            }
        }

        return "Sorry, that product is not in our inventory.";
    }

    public static ArrayList<Map<String, Object>> winspect(String filePath) {
        ArrayList<Map<String, Object>> List = new ArrayList<>();
        File infoFile = new File(filePath);

        try {
            //Json file parsed to elements
            JsonElement info = JsonParser.parseReader(new FileReader(infoFile));
            //elems --> objects
            JsonObject object = info.getAsJsonObject();
            //array of json objects
            JsonArray information = object.get("products").getAsJsonArray();
            //loop to read all objects in the array
            for (JsonElement pObject : information) {
                JsonObject produce = pObject.getAsJsonObject();

                //pulls data from file
                //pull names
                String name = produce.get("name").getAsString();
                //pull prices linked to names
                Double price = produce.get("price").getAsDouble();
                //pull quantities of products
                int quantity = produce.get("quantity").getAsInt();

                Map<String, Object> qc = new HashMap<>();

                qc.put("name", name);
                qc.put("price", price);
                qc.put("quantity", quantity);
                //add to map
                List.add(qc);
            }
        } catch (FileNotFoundException q) {
            System.out.println("No JSON File.");
        }

        return List;
    }
}

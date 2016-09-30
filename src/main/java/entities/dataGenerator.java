/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;

public class dataGenerator {

    private static final ArrayList<person> myList = new ArrayList<>();
    private final Gson gson = new Gson();
    //JSONObject tmpJson = new JSONObject();

    public dataGenerator() {

    }

    public void generateData() {
        for (int i = 1; i != 100; i++) {
            myList.add(new person("FNAME " + i, "LNAME " + i, "STREET " + i, "CITY " + i));
        }
    }

    public String getData(int maxIndex, String desired) {
        String desiredArr[] = desired.split(",");

        JsonArray arr = new JsonArray();

        for (int i = 0; i != maxIndex; i++) {
            JsonObject tmpJson = new JsonObject();

            for (String tmp : desiredArr) {
                switch (tmp) {
                    case "fname":
                        tmpJson.addProperty("fname", myList.get(i).getFname());
                        break;
                    case "lname":
                        tmpJson.addProperty("lname", myList.get(i).getLname());
                        break;
                    case "street":
                        tmpJson.addProperty("street", myList.get(i).getStreet());
                        break;
                    case "city":
                        tmpJson.addProperty("city", myList.get(i).getCity());
                        break;
                    default:
                        break;
                }
            }

            arr.add(tmpJson);

        }
        return gson.toJson(arr);

    }
}

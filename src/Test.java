
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String args[]) {
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        Map map = new Map();

        try (FileReader reader = new FileReader("map.json")) {
            map = gson.fromJson(reader, Map.class);
            System.out.println(gson.toJson(map));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(map.sectors.get(12).data.name);

        try (FileWriter writer = new FileWriter("map.json")) {
            gson.toJson(map, map.getClass(), writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

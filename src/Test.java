
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String args[]) {
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        Map map = new Map();
        //массив читает правильно
        try (JsonReader reader = new JsonReader(new FileReader("map_in.json"))) {
            map.sectors = gson.fromJson(reader, map.sectors.getClass());
            System.out.println(gson.toJson(map));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //целый объект тоже отлично выводит
        try (JsonWriter writer = new JsonWriter(new FileWriter("map.json"))) {
            gson.toJson(map, map.getClass(), writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //@fixme
        //должно быть логичным, что он может прочитать то, что сам вывел
        //но нет, кидает ошибку, что ожидался объект, а ты мне дал число
//        try (JsonReader reader = new JsonReader(new FileReader("map.json"))) {
//            map = gson.fromJson(reader, Map.class);
//            System.out.println(gson.toJson(map));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

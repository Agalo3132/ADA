package ADA;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Json {
    public static String stream(String url) {
        try (InputStream input = new URL(url).openStream()) {
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder json = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                json.append((char) c);
            }
            return json.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String caturl = "https://catfact.ninja/facts";

        String jsonString = stream(caturl);
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray a = jsonObject.getJSONArray("data");
        JSONObject o = a.getJSONObject(1);
        System.out.println(o.getString("fact"));

    }
}

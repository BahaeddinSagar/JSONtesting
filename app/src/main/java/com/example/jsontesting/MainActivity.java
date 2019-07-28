package com.example.jsontesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ParseJSON(View view) {
        try {
            parseJsonComplex();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSON ERROR", Toast.LENGTH_SHORT).show();
        }
    }

    private void parseJsonComplex() throws JSONException {
        String jsonObject = "{\"coord\":{\"lon\":-0.13,\"lat\":51.51},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":292.92,\"pressure\":1006,\"humidity\":68,\"temp_min\":288.71,\"temp_max\":296.48},\"visibility\":10000,\"wind\":{\"speed\":6.2,\"deg\":290},\"clouds\":{\"all\":90},\"dt\":1564318585,\"sys\":{\"type\":1,\"id\":1414,\"message\":0.0091,\"country\":\"GB\",\"sunrise\":1564287459,\"sunset\":1564343769},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";

        JSONObject object = new JSONObject(jsonObject);

        float latttttt = Float.parseFloat(object.getJSONObject("coord").getString("lat"));
        float lon = Float.parseFloat(object.getJSONObject("coord").getString("lon"));

        String description = object.getJSONArray("weather").getJSONObject(0).getString("description");
        String main = object.getJSONArray("weather").getJSONObject(0).getString("main");
        float temp = Float.parseFloat(object.getJSONObject("main").getString("temp"));

        String name = object.getString("name");

        ExtendedWeather extendedWeather = new ExtendedWeather(temp,latttttt,lon,description,name);

        TextView textView = findViewById(R.id.output);
        textView.setText(extendedWeather.toString());



    }

    private void parseJsonArray() throws JSONException {
        String JSONstring = "[{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8},{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8}]";
        JSONArray Jarray;
        ArrayList<Weather> weathers = new ArrayList<>();

            Jarray = new JSONArray(JSONstring);

            for (int i = 0; i < Jarray.length(); i++) {
                JSONObject object = Jarray.getJSONObject(i);
                int temp = object.getInt("temp");
                int pressure = object.getInt("pressure");
                int hum = object.getInt("humidity");
                int temp_min = object.getInt("temp_min");
                int temp_max = object.getInt("temp_max");

                Weather w = new Weather(temp, hum, pressure, temp_min, temp_max);

                weathers.add(w);
            }
            TextView textView = findViewById(R.id.output);
            textView.setText(weathers.toString());




    }


    void parseSingleJsonObject() {
        String JSONstring = "{\"temp\":7,\"pressure\":1012,\"humidity\":81,\"temp_min\":5,\"temp_max\":8}";
        Weather w = null;
        try {
            JSONObject object = new JSONObject(JSONstring);


            int temp = object.getInt("temp");
            int pressure = object.getInt("pressure");
            int hum = object.getInt("humidity");
            int temp_min = object.getInt("temp_min");
            int temp_max = object.getInt("temp_max");

            w = new Weather(temp, hum, pressure, temp_min, temp_max);


        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (w != null) {
            TextView textView = findViewById(R.id.output);
            textView.setText(w.toString());

        }


    }

}

package com.andigital.kotlintest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sverma on 02/05/2018.
 */

public class MainActivityJava extends AppCompatActivity {

    private static final String TAG = MainActivityJava.class.getSimpleName();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Country country = new Country("France", "+33");

        final TextView textView = findViewById(R.id.hello_world);

        textView.setText(getString(R.string.hello_world, country.getCountryName()));

        final Country country2 = new Country("UK", "+44");

        final String message;
        if (country != null && country2 != null && country.getCountryName().equals(country2.getCountryName())) {
            message = "match";
        } else {
            message = "don't match";

        }

        final String message2 = (country.equals(country2)) ? "match" : "don't match";

        for (int i = 10; i >= 0; i = i - 2) {
            System.out.print(i);
        }


        final HashMap<String, Integer> keymap = new HashMap<>();

        for (String key : keymap.keySet()) {
            System.out.print(key + " is " + keymap.get(key));
        }

        final List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        for (Integer integer : integers) {
            System.out.print(integer);
        }


    }

    public void showCountry(CountryJava country) {
        if (country.getCountryName() != null) {
            System.out.print(country.getCountryName());
        }
    }

    public void showContinent(CountryJava country) {
        String continent = "";
        switch (country.getCountryName()) {
            case "UK":
                continent = "Europe";
                break;
            case "Hong Kong":
                continent = "Asia";
                break;
            case "Sydney":
                continent = "Australia";
                break;
            default:
                continent = "Africa";

        }

    }

    public int countryCodeInt(CountryJava country) {
        int countryCode;
        try {
            countryCode = Integer.parseInt(country.getCountryCode());
        } catch (NumberFormatException e) {
            countryCode = -1;
        }
        return countryCode;
    }

    public int max(int a, int b) {
        return a + b ;
    }
}

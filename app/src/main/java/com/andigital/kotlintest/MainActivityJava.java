package com.andigital.kotlintest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by sverma on 02/05/2018.
 */

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Country country = new Country("France");

        final TextView textView = findViewById(R.id.hello_world);

        textView.setText(getString(R.string.hello_world, country.getCountryName()));

        final Country country2 = new Country("UK");

        final String message;
        if(country.equals(country2)) {
            message = "match";
        } else {
            message ="don't match";

        }

        final String message2 = (country.equals(country2))  ? "match" :  "don't match";


    }
}

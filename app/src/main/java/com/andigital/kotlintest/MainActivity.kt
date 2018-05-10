package com.andigital.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val country = Country("France")

        val textView = findViewById<TextView>(R.id.hello_world)
        textView.text = getString(R.string.hello_world, country.countryName)
        //todo: Add lambda function in Country and show it's usage

        val country2 = Country("UK")

        var message = ""
        if(country == country2) {
            message = "match"
        } else {
            message = "don't match"

        }

        val message2 = if(country == country2)  "match" else  "don't match"



    }
}


package com.andigital.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val country:Country = Country("France", "+33")

        val textView = findViewById<TextView>(R.id.hello_world)
        textView.text = getString(R.string.hello_world, country?.countryName)
        //todo: Add lambda function in Country and show it's usage

        val nullableCountry:Country? = Country("UK", "+44")

            Log.d("Country", nullableCountry?.countryName)

        var message = ""
        if (country.countryName == nullableCountry?.countryName) {
            message = "match"
        } else {
            message = "don't match"

        }

        val countryCode: Int = try {
            Integer.parseInt(country.countryCode)
        } catch (e:NumberFormatException) {
            -1
        }

        for(i in 10 downTo 1) {
            println(i)
        }

        var numbers:List<Int> = listOf(1,2,3,4,5)
        for(i in numbers) {
            println(i)
        }

        var keymap = TreeMap<String, Int>()

        for((key,value) in keymap) {
            println("$key is $value")
        }


        val message2 = if (country == nullableCountry) "match" else "don't match"

        println("sum " + sum(2,3))

    }

    fun showCountry(country: Country) {
        println(country.countryName)
    }

    fun showContinent(country: Country) {
        var continent = ""
        if(country.countryName == "UK") {
            continent = "Europe"
        } else if(country.countryName == "Hong Kong") {
            continent = "Asia"
        } else if(country.countryName == "Sydney") {
            continent = "Australia"
        } else {
            continent = "Africa"
        }

        when {
            country.countryName == "UK" -> continent = "Europe"
            country.countryName == "Hong Kong" -> continent = "Asia"
            country.countryName == "Sydney" -> continent = "Australia"
            else -> continent = "Africa"
        }
    }

    fun sum(a: Int, b: Int) : Int = a + b


}


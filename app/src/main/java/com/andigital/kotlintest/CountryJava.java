package com.andigital.kotlintest;

/**
 * Created by sverma on 02/05/2018.
 */

public class CountryJava {
    private String countryName;

    private String countryCode;

    public CountryJava(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryJava that = (CountryJava) o;

        return countryName != null ? countryName.equals(that.countryName) : that.countryName == null;
    }

    @Override
    public int hashCode() {
        return countryName != null ? countryName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CountryJava{" +
                "countryName='" + countryName + '\'' +
                '}';
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }



}

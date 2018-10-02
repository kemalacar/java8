package com.kml.java8.lamda;

import com.kml.java8.common.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Kemal Acar
 */
public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Map<String,List<String>> cityCountryMap = Data.cityCountryMap;


        Result germany = (country,city)-> {
            List<String> cities = cityCountryMap.get(country);
            return cities!=null? cities.contains(city) : false ;//must return interface's search return (Boolean).
        };


        System.out.println("Berlin is a Germany city ? " + germany.search("Germany","Berlin"));
        System.out.println("Istanbul is a Russian city ? " + germany.search("Russian","Istanbul"));
        System.out.println("Moscow is a Spain city ? " + germany.search("Spain","Moscow"));
        System.out.println("Barcelona is a Spain city ? " + germany.search("Spain","Barcelona"));

    }
}

@FunctionalInterface
interface Result{
    Boolean search(String country, String city);
}

    
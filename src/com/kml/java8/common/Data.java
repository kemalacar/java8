package com.kml.java8.common;

import java.util.*;

/**
 * @author Kemal Acar
 */
public class Data {

    public static Map<String,List<String>>  cityCountryMap = new HashMap<>();
    public static List<String> continents = new ArrayList<>();

    static{

        continents.add("Africa");
        continents.add("Europa");
        continents.add("Asia");
        continents.add("North America");
        continents.add("South America");
        continents.add("Australia");
        continents.add("Antarctica");

        cityCountryMap.put("Netherlands", Arrays.asList("Amsterdam","Rotterdam","Utrecht"));
        cityCountryMap.put("Turkey", Arrays.asList("Istanbul","Izmir","Ankara","Mardin","Trabzon"));
        cityCountryMap.put("Spain", Arrays.asList("Madrid","Barcelona","Valencia","Cordoba"));
        cityCountryMap.put("Germany", Arrays.asList("Berlin","Munich","Hamburg","Hanover"));
        cityCountryMap.put("Russia", Arrays.asList("Moscow","Saint Petersburg","Novosibirsk","Yekaterinburg"));
    }

}

    
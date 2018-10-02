package com.kml.java8.lamda;

import com.kml.java8.common.Data;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Kemal Acar
 */
public class ForEachExample {

    public static void main(String[] args) {


        List<String> continents = Data.continents;

        AtomicInteger i = new AtomicInteger(); // you can atomic variables in scope of lamda.

        System.out.println("Continents : ");
        continents.forEach((continent) -> {
            System.out.println("\t"+(i.incrementAndGet()) +" = " + continent);
        });


        System.out.println("\nCountries : ");
        Map<String, List<String>> cityCountryMap = Data.cityCountryMap;

        cityCountryMap.forEach((key, value) -> {

            System.out.println("\t"+ key);

            value.forEach(city -> {
                System.out.println("\t\t" +city);
            });

        });


    }
}

    
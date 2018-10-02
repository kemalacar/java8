package com.kml.java8.methodReference;

import com.kml.java8.common.Data;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Kemal Acar
 */
public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> continents = Data.continents;
        //print names of continents.
        continents.forEach(MethodReferenceExample::print);//parameter and types have to matched.

        System.out.println("\nSorted List : ");
        //sort continents
        Collections.sort(continents,String::compareTo);// String compareTo method.
        continents.forEach(MethodReferenceExample::print);


        System.out.println("\nReversed List : ");
        //reverse continents
        Collections.sort(continents, MethodReferenceExample::reverseCompare);// our method
        continents.forEach(MethodReferenceExample::print);

    }

    public static int reverseCompare(String s1,String s2){
     return s2.compareTo(s1);
    }

    public static void print(String text){
        System.out.println(text);
    }
}

    
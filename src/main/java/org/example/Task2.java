package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Again, the input is a long list of integers.
 * Provide a working code that will find all the pairs (in this integer list) that sum up to 13.
 * Each pair in the output should have first number not greater than the second one and lines should be sorted in an ascending order.
 */

public class Task2 {
    public static List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) {
        integerList.add(1);
        integerList.add(2);
        integerList.add(10);
        integerList.add(7);
        integerList.add(5);
        integerList.add(3);
        integerList.add(6);
        integerList.add(6);
        integerList.add(13);
        integerList.add(0);

        List<Integer> sorted = integerList.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < sorted.size(); i++) {

            int first = sorted.get(i);

            for (int j = 0; j < sorted.size(); j++) {

                int second = sorted.get(j);

                if ((first + second == 13) && first < second){
                    System.out.println(first + " " + second);
                }

            }
        }
    }
}
package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order,
 * plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.
 */

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Provide list of integers. Type any literal character to finish providing");

        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int typedNumber = scanner.nextInt();
            integerList.add(typedNumber);
        }

        /*
        number of distinct elements
         */
        List<Integer> distinctNumbers = integerList.stream().sorted().distinct().collect(Collectors.toList());

        //sorted distinct numbers
        System.out.println(distinctNumbers);

        //number of elements in the source
        System.out.println("count: " + integerList.size());

        //number of distinct elements
        System.out.println("distinct: "+ distinctNumbers.size());

        //min value
        System.out.print("Min: ");
        integerList.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);

        //max value
        System.out.print("max: ");
        integerList.stream().max(Integer::compare).ifPresent(System.out::print);
    }
}

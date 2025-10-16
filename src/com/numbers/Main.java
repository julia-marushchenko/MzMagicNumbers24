// Java program to find numbers dividable by 3.

package com.numbers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating set with unic numbers
        Set<Integer> unicSet = new HashSet<>();

        // Adding numbers to set
        for (int index = 0; index < 27; index++) {
            unicSet.add(new Random().nextInt());
        }

        // Printing numbers and result of division
        Iterator<Integer> iterator = unicSet.iterator();
        while (iterator.hasNext()) {

            // Creating helping number
            int temporalNumber = iterator.next();

            // Condition number % 3
            if (temporalNumber % 3 == 0) {

                // Printing result to console
                System.out.println(temporalNumber + " is dividable by 3");
            } else {

                // Printing result to console
                System.out.println(temporalNumber + " is not dividable by 3");
            }
        }
    }
}
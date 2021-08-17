package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class RandomNumberCalculation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pls enter size of ");
        final var sizeOfArrays = in.nextInt();

        double[] firstRandomArray = sortArrayByAscending(createRandomArray(sizeOfArrays));
        double[] secondRandomArray = sortArrayByAscending(createRandomArray(sizeOfArrays));

        System.out.println("First array : " + Arrays.toString(firstRandomArray));
        System.out.println("Second array : " + Arrays.toString(secondRandomArray));
        System.out.println("Calculated array : " + Arrays.toString(Main.calculateArrays(firstRandomArray, secondRandomArray, "+")));
    }

    public static double[] createRandomArray(int sizeOfArray) {
        double[] array = new double[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil(Math.random() * 150);
        }
        return array;
    }

    public static double[] sortArrayByAscending(double[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}


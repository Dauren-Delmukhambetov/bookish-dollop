package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pls enter through space parameters for first Array: ");
        System.out.println("initial value, size of array, step of array, increment operator((+),(*),(-),(^) or (/))");
        var arrayParametersForFirstArray = in.nextLine();
        System.out.println("Pls enter through space parameters for second Array: ");
        System.out.println("initial value, size of array, step of array, increment operator((+),(*),(-),(^) or (/))");
        var arrayParametersForSecondArray = in.nextLine();
        System.out.println("Pls enter operator to calculate the third array (+),(*),(-),(^) or (/)");
        var generalOperator = in.nextLine();

        String[] parametersForFirstArray;
        parametersForFirstArray = arrayParametersForFirstArray.split(" ");
        validateOfNumberOfArray(arrayParametersForFirstArray);
        double initialValueOfFirstArray = Double.parseDouble(parametersForFirstArray[0]);
        int sizeOfFirstArray = Integer.parseInt(parametersForFirstArray[1]);
        double stepOfFirstArray = Double.parseDouble(parametersForFirstArray[2]);
        String operatorOfFirstArray = parametersForFirstArray[3];
        String[] parametersForSecondArray;
        parametersForSecondArray = arrayParametersForSecondArray.split(" ");
        validateOfNumberOfArray(arrayParametersForSecondArray);
        double initialValueOfSecondArray = Double.parseDouble(parametersForSecondArray[0]);
        int sizeOfSecondArray = Integer.parseInt(parametersForSecondArray[1]);
        double stepOfSecondArray = Double.parseDouble(parametersForSecondArray[2]);
        String operatorOfSecondArray = parametersForSecondArray[3];

        double[] firstArray = createArray(initialValueOfFirstArray, sizeOfFirstArray, stepOfFirstArray, operatorOfFirstArray);
        double[] secondArray = createArray(initialValueOfSecondArray, sizeOfSecondArray, stepOfSecondArray, operatorOfSecondArray);

        System.out.println("First Array" + Arrays.toString(firstArray));
        System.out.println("Second array" + Arrays.toString(secondArray));

        if (sizeOfFirstArray == sizeOfSecondArray) {

            System.out.println("The result of " + generalOperator + " entered arrays is " + Arrays.toString(CalculateArrays(firstArray, secondArray, generalOperator)));

        } else
            System.out.println("Please enter the same size of arrays");
    }

    public static double[] createArray(double initialValue, int sizeOfArray, double stepOfArray, String incrementOperator) {
        double[] array = new double[sizeOfArray];
        array[0] = initialValue;
        for (int i = 1; i < array.length; i++) {
            switch (incrementOperator) {
                case "+" -> array[i] = array[i - 1] + stepOfArray;
                case "-" -> array[i] = array[i - 1] - stepOfArray;
                case "*" -> array[i] = array[i - 1] * stepOfArray;
                case "/" -> array[i] = array[i - 1] / stepOfArray;
                case "^" -> array[i] = Math.pow(array[i - 1], stepOfArray);
                default -> {
                    System.err.println("Error: Wrong operator for array");
                    System.exit(0);
                }
            }
        }
        return array;
    }

    public static double[] CalculateArrays(double[] arrayFirst, double[] arraySecond, String operator) {
        double[] calculatedArray = new double[arrayFirst.length];
        for (int i = 0; i < calculatedArray.length; i++) {
            switch (operator) {
                case "+" -> calculatedArray[i] = arrayFirst[i] + arraySecond[i];
                case "-" -> calculatedArray[i] = arrayFirst[i] - arraySecond[i];
                case "*" -> calculatedArray[i] = arrayFirst[i] * arraySecond[i];
                case "/" -> calculatedArray[i] = arrayFirst[i] / arraySecond[i];
                case "^" -> calculatedArray[i] = Math.pow(arrayFirst[i], arraySecond[i]);
                default -> {
                    System.err.println("Error: Wrong general operator for second array");
                    System.exit(0);
                }
            }
        }
        return calculatedArray;
    }

    public static void validateOfNumberOfArray(String arrays) {
        if (arrays.length() != 4) {
            System.err.println("Please enter all values");
            System.exit(0);
        }
    }
}


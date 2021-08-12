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


        String[] parametersForFirstArray = arrayParametersForFirstArray.split(" ");
        String[] parametersForSecondArray = arrayParametersForSecondArray.split(" ");

        validateArrayLength(parametersForFirstArray);
        validateArrayLength(parametersForSecondArray);

        final var initialValueOfFirstArray = Double.parseDouble(parametersForFirstArray[0]);
        final var initialValueOfSecondArray = Double.parseDouble(parametersForSecondArray[0]);

        final var sizeOfFirstArray = Integer.parseInt(parametersForFirstArray[1]);
        final var sizeOfSecondArray = Integer.parseInt(parametersForSecondArray[1]);

        final var stepOfFirstArray = Double.parseDouble(parametersForFirstArray[2]);
        final var stepOfSecondArray = Double.parseDouble(parametersForSecondArray[2]);

        String operatorOfFirstArray = parametersForFirstArray[3];
        String operatorOfSecondArray = parametersForSecondArray[3];

        double[] firstArray = createArray(initialValueOfFirstArray, sizeOfFirstArray, stepOfFirstArray, operatorOfFirstArray);
        double[] secondArray = createArray(initialValueOfSecondArray, sizeOfSecondArray, stepOfSecondArray, operatorOfSecondArray);

        System.out.println("First Array" + Arrays.toString(firstArray));
        System.out.println("Second array" + Arrays.toString(secondArray));

        if (sizeOfFirstArray == sizeOfSecondArray) {

            System.out.println("The result of " + generalOperator + " entered arrays is " + Arrays.toString(calculateArrays(firstArray, secondArray, generalOperator)));

        } else
            System.out.println("Please enter the same size of arrays");
    }

    public static double[] createArray(double initialValue, int sizeOfArray, double stepOfArray, String incrementOperator) {
        double[] array = new double[sizeOfArray];
        array[0] = initialValue;
        for (int i = 1; i < array.length; i++) {
            array[i] = calculateNumber(initialValue, stepOfArray, incrementOperator);
        }
        return array;
    }

    public static double[] calculateArrays(double[] arrayFirst, double[] arraySecond, String operator) {
        double[] calculatedArray = new double[arrayFirst.length];
        for (int i = 0; i < calculatedArray.length; i++) {
            calculatedArray[i] = calculateNumber(arrayFirst[i], arraySecond[i], operator);
        }
        return calculatedArray;
    }

    public static void validateArrayLength(String[] arrays) {
        if (arrays.length != 4) {
            System.err.println("Please enter 4 input values");
            System.exit(0);
        }
    }

    public static double calculateNumber(double firstValue, double secondValue, String operator) {
        switch (operator) {
            case "+":
                return firstValue + secondValue;
            case "-":
                return firstValue - secondValue;
            case "*":
                return firstValue * secondValue;
            case "/":
                return firstValue / secondValue;
            case "^":
                return Math.pow(firstValue, secondValue);
            default: {
                System.err.println("Error: Wrong general operator for second array");
                return 0;

            }
        }

    }
}


package com.company;

import com.sun.source.tree.SwitchTree;

import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pls enter initial value of 1st array");
        var inValueForFirstArray = in.nextInt();
        System.out.println("Pls enter size of arrays");
        var sizeOfArrays = in.nextInt();
        System.out.println("Pls enter step of 1st array");
        var stepForFirstArray = in.nextInt();
        System.out.println("Pls enter increment operator of 1st array (+),(*),(-) or (/)");
        String operatorForFirstArray = in.next();
        System.out.println("Pls enter initial value of 2nd array");
        var inValueForSecondArray = in.nextInt();
        System.out.println("Pls enter step of 2nd array");
        var stepForSecondArray = in.nextInt();
        System.out.println("Pls enter increment operator of 2nd array (+),(*),(-),(^) or (/)");
        String operatorForSecondArray = in.next();
        System.out.println("Pls enter operator to calculate the third array (+),(*),(-),(^) or (/)");
        String GeneralOperator = in.next();
        boolean x = false;


        double[] array1 = new double[sizeOfArrays];
        array1[0] = inValueForFirstArray;

        for (int i = 1; i < sizeOfArrays; i++) {
            switch (operatorForFirstArray) {
                case "+":
                    array1[i] = array1[i - 1] + stepForFirstArray;
                    break;
                case "-":
                    array1[i] = array1[i - 1] - stepForFirstArray;
                    break;
                case "*":
                    array1[i] = array1[i - 1] * stepForFirstArray;
                    break;
                case "/":
                    array1[i] = array1[i - 1] / stepForFirstArray;
                    break;
                default:
                    x = true;
                    break;

            }
            if (x) {
                System.out.println("Error: Wrong operator for first array");
                break;


            }
        }
        String array1String = Arrays.toString(array1);
        System.out.println("You enter 1st array  " + array1String);


        double[] array2 = new double[sizeOfArrays];
        array2[0] = inValueForSecondArray;
        for (int i = 1; i < array1.length; i++) {
            switch (operatorForSecondArray) {
                case "+":
                    array2[i] = array2[i - 1] + stepForSecondArray;
                    break;
                case "-":
                    array2[i] = array2[i - 1] - stepForSecondArray;
                    break;
                case "*":
                    array2[i] = array2[i - 1] * stepForSecondArray;
                    break;
                case "/":
                    array2[i] = array2[i - 1] / stepForSecondArray;
                    break;
                case "^":
                    array2[i] = Math.pow(array1[i - 1], stepForSecondArray);
                    break;
                default:
                    i = sizeOfArrays;
                    System.out.println("Error: Wrong operator for second array");
                    break;
            }


        }
        String array2String = Arrays.toString(array2);
        System.out.println("You enter 2nd array" + array2String);

        double[] array3 = new double[sizeOfArrays];
        switch (GeneralOperator) {
            case "+":
                for (int i = 0; i < array1.length; i++) {
                    array3[i] = array1[i] + array2[i];
                }
                break;
            case "-":
                for (int i = 0; i < array1.length; i++) {
                    array3[i] = array1[i] - array2[i];
                }
                break;
            case "*":
                for (int i = 0; i < array1.length; i++) {
                    array3[i] = array1[i] * array2[i];
                }
                break;
            case "/":
                for (int i = 0; i < array1.length; i++) {
                    array3[i] = array1[i] / array2[i];
                }
                break;
            case "^":
                for (int i = 0; i < array1.length; i++) {
                    array3[i] = Math.pow(array1[i], array2[i]);
                }
            default:
                System.out.println("Error: Wrong general operator");
                System.exit(0);

                break;


        }
        String array3String = Arrays.toString(array3);
        System.out.println("The result of " + GeneralOperator + " entered arrays is " + array3String);


    }
}

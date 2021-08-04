package com.company;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Pls enter first value");
        double value1 = in.nextInt();
        System.out.println("Pls enter second value");
        double value2 = in.nextInt();
        System.out.println("Pls enter operator sum(+),mult(*),sub(-) or div(/)");
        String operator = in.next();

        if (operator.equalsIgnoreCase("sum") || operator.equals("+"))
            result = value1 + value2;
        else if (operator.equalsIgnoreCase("mult") || operator.equals("*"))
            result = value1 * value2;
        else if (operator.equalsIgnoreCase("sub") || operator.equals("-"))
            result = value1 - value2;
        else if (operator.equalsIgnoreCase("div") || operator.equals("/"))
            result = value1 / value2;
        else System.out.println("Wrong value, pls try again");

        System.out.println("Your result  " + String.format("%.2f%n", result));

    }

}

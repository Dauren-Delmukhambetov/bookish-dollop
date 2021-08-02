package com.company;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double result = 0;
        Formatter f = new Formatter();
        Scanner in = new Scanner(System.in); //test
        System.out.println("Pls enter first value"); //test
        double value1 = in.nextInt();
        System.out.println("Pls enter second value");
        double value2 = in.nextInt();
        System.out.println("Pls enter operator sum(+),mult(*),sub(-) or div(/)");
        String operator = in.next();

        if (operator.equals("sum"))
            result = value1 + value2;
        else if (operator.equals("mult"))
            result = value1 * value2;
        else if (operator.equals("sub"))
            result = value1 - value2;
        else if (operator.equals("div"))
            result = value1 / value2;
        else System.out.println("Wrong value, pls try again");

        System.out.println("Your result  " + f.format("%.2f%n", result));

    }

}

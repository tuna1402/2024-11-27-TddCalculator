package com.ll;

import java.util.Arrays;

public class polynomialCal {
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        return num1 / num2;
    }

    public String polyCal(String expression) {
        String[] arr = expression.split("");
//        System.out.println(Arrays.toString(arr)); //[(, 3,  , +,  , 5, )]
        if (Arrays.toString(arr).contains("(")) {
            int open = Arrays.asList(arr).indexOf("(");
            int close = Arrays.asList(arr).indexOf(")");
//            System.out.println(open); //0
//            System.out.println(close); //6

            char[] chArr = new char[5];
            expression.getChars(open+1, close, chArr, 0);
            return String.valueOf(chArr);
        } else {
            return expression;
        }
    }

    public int stringCal(String innerExpression) {
        String[] arr = innerExpression.split("");
        switch (arr[2]) {
            case "+" -> {
                int result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[4]);
                return result;
            }
            case "-" -> {
                int result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[4]);
                return result;
            }
            case "*" -> {
                int result = Integer.parseInt(arr[0]) * Integer.parseInt(arr[4]);
                return result;
            }
            case "/" -> {
                int result = Integer.parseInt(arr[0]) / Integer.parseInt(arr[4]);
                return result;
            }
        }
        return 0;
    }

    public int newCal(String expression) {
        String[] arr = expression.split("");
        String exp1 = polyCal(expression);
        int answer1 = stringCal(exp1);
        String exp2 = Integer.toString(answer1);
        String exp3 = exp2 + ' ' + arr[8] + ' ' + arr[10];
        System.out.println(exp3);
        int result = stringCal(exp3);
        return result;
    }
}

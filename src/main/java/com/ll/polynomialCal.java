package com.ll;

import java.util.Arrays;

public class polynomialCal {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public double div(int num1, int num2) {
        return (double)num1 / num2;
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
}

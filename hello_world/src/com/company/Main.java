package com.company;

import java.util.Scanner;

public class Main {
    private static double first = 0;
    private static double second = 0;
    private static String op;
    private static String temp = "";
    //
    public static void main(String[] args) {
        temp = "5";
        //temp += "3";
        add();
        temp = "5";
        //temp += "0";
        multiply();
        temp = "2";
        compute();
        System.out.println(first);
    }

    //
    private static void add() {
        operation("+");
    }

    private static void multiply() {
        operation("*");
    }

    //.....
    //
    //
    private static void operation(String str) {
        if(!op.equals(""))
            calc();
        op = str;
        calc();
    }

    //
    private static void calc() {
        second = Double.parseDouble(temp);
        temp = "";
        switch (op) {
            case "+":
                first += second;
                break;
            case "-":
                first -= second;
                break;
            case "*":
                first *= second;
                break;
            case "/":
                first /= second;
                break;
            default:
                System.out.println("error");
        }
        //
        System.out.println(first);
        second = 0;
    }

    //
    //
    private static void compute() {
        calc();
    }
}

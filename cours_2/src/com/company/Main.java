package com.company;

public class Main {

    public static void main(String[] args) {
        String var_1;
        var_1 = "test";
        //
        int var_2 = 1234567891;
        long var_3 = 1234567891;
        var_3 = var_2;
        //
        float var_5 = (float) 123.45;
        double var_4 = 123.45;
        //
        char var_6 = 's';
        //
        boolean var_7 = true;
        boolean var_8 = false;
        String x = String.format("Bonjour %s test %d %d", var_1, var_2, var_3);
        String y = "Bonjour " + var_1 + " test " + var_2 + var_3;
        var_7 = Boolean.parseBoolean("true");
        //System.out.println(var_7);
        //
        boolean res = 1 == 2;
        System.out.println(res);
        // var1 != x
        if (!var_1.equals("x")) {
            System.out.println("var1 == x");
        } else {
            System.out.println("var1 != x");
        }
        //
        if (var_1.equals("x")) {
            System.out.println("var1 == x");
        } else if (var_1.equals("y")) {
            System.out.println("var1 == y");
        } else if (true) {
            System.out.println("true");
        } else {
            System.out.println("var1 != x");
        }
        //
        if (var_1.equals("") || var_1.equals("test")) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        //
        if (var_1.equals("") && var_1.equals("test")) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        //
        if (false || (true && var_1.equals("test"))) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        //
        System.out.println("-----");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println("");
        int ff = 0;
        while (ff < 10) {
            System.out.print(ff + " ");
            ff = ff + 1;
        }
        System.out.println("");
        ff = 0;
        do {
            System.out.print(ff + " ");
            ff = ff + 1;
        } while (ff < 10);
        //
        // i = 0
        System.out.println("");
        ff = -1;
        while (ff != -1) {
            System.out.print(ff + " ");
            ff = -1;
        }
        System.out.println("");
        //i = 1;
        ff = -1;
        do {
            System.out.print(ff + " ");
            ff = -1;
        } while (ff != -1);
    }
}

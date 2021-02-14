package com.company;

public class Main {

    public static void main(String[] args) {
        String x = "a";
        switch (x) {
            case "a":
                System.out.println("x == a");
                break;
            case "b":
                System.out.println("x == b");
                break;
            case "c":
                System.out.println("x == c");
                break;
            default:
                System.out.println("x fac");
        }
        //
        /*int salaire = 10000;//
        int age = 60;//
        int prime = 0;

        if (age < 60) {
            prime = 1000;
        } else if (age >= 60) {
            prime = 1500;
        }

        salaire = salaire + prime;
        System.out.println(salaire);*/
        int salaire = 10000, age = 60;

        if (age < 60)
            salaire += 1000;
        else if (age >= 60)
            salaire += 1500;

        System.out.println(salaire);
        //
        salaire = 10000;
        String nationality = "Maroccain";
        //
        switch (nationality) {
            case "Maroccain":
                salaire += 500;
            default:
                salaire += 1000;
        }
        System.out.println(salaire);
        //
        if (true)
            System.out.println("a");
        System.out.println("b");
    }
}

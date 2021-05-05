package com.company;

import java.util.Scanner;

public class Main {
    static StructureResultat[] result = new StructureResultat[4];

    //
    public static void main(String[] args) {
        result[0] = new StructureResultat(1, "Amine Herrak", genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber());
        result[1] = new StructureResultat(2, "Ayman Taleb", genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber());
        result[2] = new StructureResultat(3, "Rachid Ghoalm", genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber());
        result[3] = new StructureResultat(4, "Samia Taleb", genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber(), genRandomNumber());
        //
        for (StructureResultat resultat : result) {
            System.out.println(resultat.toString());
        }
        System.out.println("---------------");
        Solution solution = new Solution(result);
        result = solution.doSolution();
        for (StructureResultat resultat : result) {
            System.out.println(resultat.toString());
        }
    }

    //
    private static String genRandomNumber() {
        return (Math.random() * 20) + "";
    }
}

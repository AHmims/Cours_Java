package com.company;

public class Matiere {
    int idMatiere;
    String nom;
    int coefficient;

    //def Constructor
    public Matiere(){

    };

    //Constructor with args
    public Matiere(int idMatiere, String nom, int coefficient) {
        this.idMatiere = idMatiere;
        this.nom = nom;
        this.coefficient = coefficient;
    }
}

package com.company;

import java.util.Date;

public class Etudiant {
    int idEtudiant;
    String nomPrenom;
    Date dateNaissance;

    //def Constructor
    public Etudiant(){

    };

    //Constructor with args
    public Etudiant(int idEtudiant, String nomPrenom, Date dateNaissance) {
        this.idEtudiant = idEtudiant;
        this.nomPrenom = nomPrenom;
        this.dateNaissance = dateNaissance;
    }
}

package com.company;

import java.text.DecimalFormat;

public class StructureResultat {
    public int id;
    public String nomPrenom;
    public String noteMath1;
    public String noteMath2;
    public String noteFrancais1;
    public String noteFrancais2;
    public String noteHistoire1;
    public String noteHistoire2;
    public String moyenne;

    public StructureResultat(int id, String nomPrenom, String noteMath1, String noteMath2, String noteFrancais1,
                             String noteFrancais2, String noteHistoire1, String noteHistoire2, String moyenne) {
        this.id = id;
        this.nomPrenom = nomPrenom;
        this.noteMath1 = noteMath1;
        this.noteMath2 = noteMath2;
        this.noteFrancais1 = noteFrancais1;
        this.noteFrancais2 = noteFrancais2;
        this.noteHistoire1 = noteHistoire1;
        this.noteHistoire2 = noteHistoire2;
        this.moyenne = moyenne;
    }

    public StructureResultat(int id, String nomPrenom, String noteMath1, String noteMath2, String noteFrancais1,
                             String noteFrancais2, String noteHistoire1, String noteHistoire2) {
        DecimalFormat df = new DecimalFormat("#.###");
        this.id = id;
        this.nomPrenom = nomPrenom;
        this.noteMath1 = df.format(Double.parseDouble(noteMath1));
        this.noteMath2 = df.format(Double.parseDouble(noteMath2));
        this.noteFrancais1 = df.format(Double.parseDouble(noteFrancais1));
        this.noteFrancais2 = df.format(Double.parseDouble(noteFrancais2));
        this.noteHistoire1 = df.format(Double.parseDouble(noteHistoire1));
        this.noteHistoire2 = df.format(Double.parseDouble(noteHistoire2));
        this.moyenne = df.format(getMyn());
    }

    public String toString() {
        return this.id + " " + this.nomPrenom + " " + "Math:" + this.noteMath1 + "|" + this.noteMath2 + " "
                + "Francais:" + this.noteFrancais1 + "|" + this.noteFrancais2 + " " + "Histoire:" + this.noteHistoire1
                + "|" + this.noteHistoire2 + " " + "Moyenne:" + this.moyenne;
    }

    public double getMyn() {
        return (((Double.parseDouble(this.noteFrancais1) + Double.parseDouble(this.noteFrancais2) / 2) * 2) + ((Double.parseDouble(this.noteMath1) + Double.parseDouble(this.noteMath2) / 2) * 2) + ((Double.parseDouble(this.noteHistoire1) + Double.parseDouble(this.noteHistoire2)) / 2) * 2) / 7;
    }
}

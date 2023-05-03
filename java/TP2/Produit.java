package TP2;

import java.util.Scanner;

public class Produit {
    private String reference;
    private int dateEntree;

    public Produit(int dateJour) {
        System.out.print("Entrez la référence du produit : ");
        this.reference = Saisir.chaine();
        this.dateEntree = dateJour;
    }

    public void afficher() {
        System.out.println("Référence : " + this.reference + " - Date d'entrée en stock : " + this.dateEntree);
    }

    public String getReference() {
        return this.reference;
    }

    public int getDateEntree() {
        return this.dateEntree;
    }
}

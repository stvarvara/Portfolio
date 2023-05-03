package TP2;

import java.util.ArrayList;
import java.util.Scanner;

public class Voiture {
    private String immatriculation;
    private String modele;
    private int nbKilometres;
    private float tarifKilometre;

    public Voiture() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Immatriculation : ");
        this.immatriculation = scanner.nextLine();
        System.out.print("Modèle : ");
        this.modele = scanner.nextLine();
        System.out.print("Nombre de kilomètres parcourus : ");
        this.nbKilometres = scanner.nextInt();
        System.out.print("Tarif de location au kilomètre : ");
        this.tarifKilometre = scanner.nextFloat();
    }

    public Voiture(String immatriculation, String modele, int nbKilometres, float tarifKilometre) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.nbKilometres = nbKilometres;
        this.tarifKilometre = tarifKilometre;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public int getNbKilometres() {
        return nbKilometres;
    }

    public float getTarifKilometre() {
        return tarifKilometre;
    }

    public void afficher() {
        System.out.println("Voiture " + modele + " immatriculée " + immatriculation + ", " + nbKilometres + " km, tarif : " + tarifKilometre + " €/km");
    }
    public static void main(String[] args) {
        ArrayList<Voiture> voitures = new ArrayList<Voiture>(10);

        voitures.add(new Voiture());
        voitures.add(new Voiture());
        voitures.add(new Voiture());

        System.out.println("Contenu de l'ArrayList de voitures :");
        for (Voiture voiture : voitures) {
            voiture.afficher();
        }

        voitures.remove(0);
        voitures.remove(1);

        System.out.println("Nouveau contenu de l'ArrayList de voitures :");
        for (Voiture voiture : voitures) {
            voiture.afficher();
        }
    }
}
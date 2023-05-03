package TP3;

public class Entraineur extends Personne{

    private int licence;

    public Entraineur(String nom, String prenom, String adresse, int licence) {
        super(nom, prenom, adresse);
        this.licence = licence;
    }

    public int getLicence() {
        return this.licence;
    }

    public String toString() {
        return super.toString() + " " + this.licence;
    }

    public void affiche() {
        System.out.println(this.toString());
    }
}
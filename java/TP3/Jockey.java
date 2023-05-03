package TP3;

public class Jockey extends Personne {
    private double poids;
    private double salaire;

    public Jockey(String nom, String prenom, String adresse, double poids, double salaire) {
        super(nom, prenom, adresse);
        this.poids = poids;
        this.salaire = salaire;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
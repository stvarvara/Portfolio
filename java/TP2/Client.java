package TP2;

public class Client {
    private static int compteur = 0;
    private int numero;
    private String nom;
    private String domicile;

    public Client(String nom, String domicile) {
        this.numero = ++compteur;
        this.nom = nom;
        this.domicile = domicile;
    }

    public Client(int numero, String nom, String domicile) {
        this.numero = numero;
        this.nom = nom;
        this.domicile = domicile;
    }

    public String getNom() {
        return nom;
    }

    public String getDomicile() {
        return domicile;
    }

    public void afficher() {
        System.out.println("Client n°" + numero + " : " + nom + ", " + domicile);
    }
}
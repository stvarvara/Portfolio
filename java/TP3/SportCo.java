package TP3;

public class SportCo extends Sport{
    private int nbJoueurs;

    SportCo(String code,String libelle, int nbJoueurs) {
        super(code, libelle);
        this.nbJoueurs = nbJoueurs;
    }

    public int getnbJoueurs() {
        return this.nbJoueurs;
    }

    public String toString() {
        return super.toString() + " (" + this.nbJoueurs + " joueurs)";
    }

    public void affiche() {
        System.out.println(this.toString());
    }
}
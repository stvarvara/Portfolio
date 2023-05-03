package TP33;

public class Gerant extends Employe {
    private static final int Nb_H_G =30;

    public Gerant(String nom, int age, int Nb_A) {
        super(nom, age, Nb_A);
    }

    @Override
    public String toString() {
        return super.toString() + "Nombre d'heures : " + Nb_H_G;
    }

    @Override
    int salaire() {
        return 5 * Nb_H_G * (20 + this.getNb_A()/2);
    }

}





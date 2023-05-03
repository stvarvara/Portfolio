package TP33;


public class Ouvrier extends Employe {

    private static final int Nb_O_H = 35;

    public Ouvrier(String nom, int age, int Nb_A) {
        super(nom, age, Nb_A);
    }

    @Override
    public String toString() {
        return super.toString() + "Nombre d'heures : " + Nb_O_H;
    }

    @Override
    int salaire() {
        return 4 * Nb_O_H * (10 + this.getNb_A()/2);
    }

}
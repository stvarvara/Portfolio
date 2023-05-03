package TP3;


import java.util.ArrayList;

public class LesSports {
    private ArrayList<Sport> sports = new ArrayList<Sport>();

    public ArrayList<Sport> getsports() {
        return sports;
    }

    public void afficheSports() {
        for (int i = 0 ; i < sports.size() ; i++) {
            sports.get(i).affiche();
        }
    }

    public void ajouterSport(String code, String libelle) {
        // TODO Tests !
        this.sports.add(new Sport(code, libelle));
    }
    public void ajouterSport(String code, String libelle, int nbJoueur) {
        // TODO Tests !
        this.sports.add(new SportCo(code, libelle, nbJoueur));
    }
    public void ajouterSport(Sport s) {
        if (this.sports.contains(s)) {
            System.err.println("[W] Sport déjà présent dans la liste !");
        } else {
            this.sports.add(s);
        }
    }
}




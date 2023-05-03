package TP3;

import java.util.ArrayList;

public class Course {
    private double dotation;
    private String nom;
    private ArrayList<ChevalDeCourse> participants = new ArrayList<ChevalDeCourse>();

    public Course(String nom, double dotation) {
        this.dotation = dotation;
        this.nom = nom;
    }

    @Override
    public String toString() {
        String res = "Course " + nom + "(" + dotation + "€ de dotation) : ";

        if (participants.size()==0) {
            res += "Pas de participants";
        } else {
            for (int i = 0 ; i < participants.size() ; i++) {
                res += "\n"+ participants.get(i).toString() + "\n";
            }
        }
        return res;
    }

    public void affiche() {
        System.out.println(this);
    }

    public boolean chevalPresent(String nom) {
        boolean trouve = false;
        int i = 0;

        while(!trouve && i < participants.size()) {
            if (participants.get(i).getNom().equals(nom)) {
                trouve = true;
            }
            i++;
        }

        return trouve;
    }

    public void enregistre(ChevalDeCourse c) {
        if (this.chevalPresent(c.getNom())) {
            System.out.println("[N] Le cheval est déjà dans la liste");
        } else {
            participants.add(c);
        }
    }

    public void rechercheCheval(String nom) {
        if (chevalPresent(nom)) {
            boolean trouve = false;
            int i = 0;

            while(!trouve && i < participants.size()) {
                if (participants.get(i).getNom().equals(nom)) {
                    trouve = true;
                } else {
                    i++;
                }
            }
            participants.get(i).affiche();
        } else {
            System.out.println("Le cheval n'est pas présent");
        }
    }

    public ChevalDeCourse meilleureCote() {
        if (participants.size() == 0) {
            return null;
        }
        ChevalDeCourse meilleur = participants.get(0);

        for (int i = 1 ; i < participants.size() ; i++) {
            if (participants.get(i).getGains() > meilleur.getGains()) {
                meilleur = participants.get(i);
            }
        }
        return meilleur;
    }

    public static void main(String[] args) {
        Jockey jockey = new Jockey("Paplusse", "Mandy", "55 Avenue De Marlioz", 55.8, 126.4);
        Entraineur entraineur = new Entraineur("Sahalor", "Aubin", "256 avenue de la paix", 123456);
        ChevalDeCourse chevalCourse = new ChevalDeCourse("Cheval", "femelle", "jconnaistjrpas", 2, entraineur);
        chevalCourse.setJockey(jockey);

        Course course = new Course("Course de Zinzin", 10000);
        course.affiche();
        System.out.println("");
        course.enregistre(chevalCourse);
        course.enregistre(chevalCourse);
        System.out.println("");
        course.affiche();
        //flemme de faire tout les tests
    }
}

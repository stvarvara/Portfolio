package TP3;

public class Cheval {
    private int id;
    public int cpt=0;
    private String nom;
    private String sexe;
    private String race;


    public Cheval(String nom, String sexe, String race) {
        this.id = cpt;
        cpt++;
        this.nom = nom;
        this.sexe = sexe;
        this.race = race;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getSexe() {
        return sexe;
    }


    public void setSexe(String sexe) {
        this.sexe = sexe;
    }


    public String getRace() {
        return race;
    }


    public void setRace(String race) {
        this.race = race;
    }


    @Override
    public String toString() {
        return "Le cheval " + this.sexe + " nommé " + this.nom + " (numéro d'inscription : " + this.id + ") est de la race : " + this.race;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cheval other = (Cheval) obj;
        return id == other.id;
    }



}

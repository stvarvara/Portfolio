package TP3;

import java.util.Objects;

public class Sport {

    private String code;

    private String libelle;

    Sport(String code,String libelle){

        this.code=code;
        this.libelle=libelle;

    }

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getLibelle() {
        return libelle;
    }


    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(code, ((Sport) obj).code);
    }

    public String toString() {
        return "Sport [" + code + "] " + libelle;
    }

    public void affiche() {
        System.out.println(this.toString());
    }

}
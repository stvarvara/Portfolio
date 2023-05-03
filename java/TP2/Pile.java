package TP2;

public class Pile {
    private Produit[] produits;
    private int indice;

    public Pile(int max) {
        this.produits = new Produit[max];
        this.indice = -1;
    }

    public boolean pilevide() {
        return this.indice == -1;
    }

    public boolean pilepleine() {
        return this.indice == this.produits.length - 1;
    }

    public void empiler(Produit p) {
        if (this.pilepleine()) {
            System.out.println("Impossible d'ajouter un produit : la pile est pleine.");
            return;
        }
        this.indice++;
        this.produits[this.indice] = p;
        System.out.println("Produit " + p.getReference() + " ajouté au stock.");
    }

    public void depiler() {
        if (this.pilevide()) {
            System.out.println("Impossible de sortir un produit : la pile est vide.");
            return;
        }
        Produit p = this.produits[this.indice];
        this.produits[this.indice] = null;
        this.indice--;
        System.out.println("Produit " + p.getReference() + " sorti du stock.");
    }

    public Produit sommet() {
        if (this.pilevide()) {
            System.out.println("La pile est vide.");
            return null;
        }
        return this.produits[this.indice];
    }
}

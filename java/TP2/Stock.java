package TP2;

public class Stock {
    private Pile pile;

    public Stock(int taille) {
        this.pile = new Pile(taille);
    }

    public void entrer(Produit p) {
        this.pile.empiler(p);
    }

    public void sortir(int dateJ) {
        Produit p = this.pile.sommet();
        while (p != null && dateJ - p.getDateEntree() > 5) {
            System.out.println("Produit " + p.getReference() + " périmé, stock intégralement supprimé.");
            this.pile.depiler();
            p = this.pile.sommet();
        }
        if (p != null) {
            System.out.println("Produit " + p.getReference() + " sorti du stock.");
            this.pile.depiler();
        }
    }
}
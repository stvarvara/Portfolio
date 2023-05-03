package TP33;

import java.util.ArrayList;
import java.util.List;
//import java.util.Collections;

public class ListeEmployes {
    private List<Employe> employes = new ArrayList<>();

    public void ajouterEmploye(Employe e) {
        if (e == null) {
            System.out.println("[W] L'employé saisi est null\n");
        } else if (this.employes.contains(e)) {
            System.out.println("[W] L'employé est déjà dans la liste\n");
        } else {
            this.employes.add(e);
        }
    }


    public void afficher() {
        System.out.println("Liste des employés :\n--------------------");
        for (int i = 0 ; i < this.employes.size() ; i++) {
            this.employes.get(i).afficher();
        }
        System.out.println("--------------------\n");
    }

    public void TrierDescParSalaire() {
//		# Méthode 1
//		for (int i=0; i<this.employes.size()-1; i++) {
//			int mini = i;
//			for (int j=i+1; j<this.employes.size(); j++) {
//				if (this.employes.get(j).salaire() < this.employes.get(mini).salaire()) {
//					mini = j;
//				}
//			}
//			Collections.swap(this.employes, mini, i);
//		}

//		# Méthode 2
//		Collections.sort(employes);

//		# Méthode 3
        this.employes.sort((o1, o2) -> o1.salaire() - o2.salaire());
    }

    public ListeEmployes selectionner(int min, int max) {
        ListeEmployes l = new ListeEmployes();

        for (int i = 0 ; i < employes.size() ; i++) {
            Employe e = employes.get(i);
            if(e.getAge() > min && e.getAge() < max) {
                l.ajouterEmploye(e);
            }
        }

        return l;
    }

    public static void main(String[] args) {
        System.out.print("Création des employés ... ");
        Employe g = new Gerant("Bénédicte Ature", 32, 5);
        Employe o1 = new Ouvrier("Terry Dicule", 42, 17);
        Employe o2 = new Ouvrier("Lara Clette", 26, 2);
        Employe o3 = new Ouvrier("Bonnie Dée", 50, 27);
        System.out.println("OK!\n");

        System.out.println("Nombre d'employés : " + Employe.getCpt() + "\n");

        System.out.print("Création de la liste ... ");
        ListeEmployes liste = new ListeEmployes();
        System.out.println("OK!\n");

        System.out.print("Peuplement des employés ... ");
        liste.ajouterEmploye(g);
        liste.ajouterEmploye(o1);
        liste.ajouterEmploye(o2);
        liste.ajouterEmploye(o3);
        System.out.println("OK!\n");



        System.out.println("Ajout d'un employé déjà présent :");
        liste.ajouterEmploye(g);
        System.out.println("Ajout d'un employé null :");
        liste.ajouterEmploye(null);

        liste.afficher();
        System.out.print("Tri décroissant par salaire des employés ... ");
        liste.TrierDescParSalaire();
        System.out.println("OK!\n");
        liste.afficher();

        System.out.print("Selection des employés entre 40 et 60 ans ... ");
        //ListeEmployes l = liste.selectionner(40, 60);
        //System.out.println("OK!\n");

        //l.afficher();
    }
}
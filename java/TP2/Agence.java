package TP2;

import java.util.ArrayList;

public class Agence {
    private String nom;
    private ArrayList<Voiture> parcVoitures;
    private ArrayList<Client> clientele;
    private ArrayList<Location> contrats;

    public Agence(String nom) {
        this.nom = nom;
        this.parcVoitures = new ArrayList<Voiture>(100);
        this.clientele = new ArrayList<Client>(100);
        this.contrats = new ArrayList<Location>(100);

        // Ajout de quelques voitures, clients et locations de démonstration
        Voiture voiture1 = new Voiture("AA-123-BB", "Renault Clio", 5000, 0.5f);
        Voiture voiture2 = new Voiture("BB-456-CC", "Peugeot 208", 10000, 0.6f);
        Voiture voiture3 = new Voiture("CC-789-DD", "Citroen DS3", 7500, 0.7f);
        this.parcVoitures.add(voiture1);
        this.parcVoitures.add(voiture2);
        this.parcVoitures.add(voiture3);

        Client client1 = new Client(  01, "Jean", "Lannion");
        Client client2 = new Client( 02, "Sophie",  "Lavak");
        this.clientele.add(client1);
        this.clientele.add(client2);

        Date startDate1 = new Date(2022, 1, 1);
        Date startDate2 = new Date(2022, 2, 1);
        Location location1 = new Location(voiture1, client1, startDate1);
        Location location2 = new Location(voiture2, client2, startDate2);
        this.contrats.add(location1);
        this.contrats.add(location2);
    }

    public void afficherListeVoitures() {
        System.out.println("Liste des voitures de l'agence " + nom + " :");
        for (Voiture voiture : parcVoitures) {
            voiture.afficher();
        }
    }

    public void afficherListeClients() {
        System.out.println("Liste des clients de l'agence " + nom + " :");
        for (Client client : clientele) {
            client.afficher();
        }
    }

    public void afficherListeLocations() {
        System.out.println("Liste des locations en cours de l'agence " + nom + " :");
        for (Location location : contrats) {
            location.display();
        }
    }
}






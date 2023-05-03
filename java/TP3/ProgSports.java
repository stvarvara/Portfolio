package TP3;

public class ProgSports {
    static public void main(String[] args) {
        LesSports lesSports = new LesSports();


        lesSports.ajouterSport(new SportCo("VOL", "Volley", 6));
        lesSports.ajouterSport(new SportCo("HDB", "Handball", 14));
        lesSports.ajouterSport(new SportCo("BSK", "Basket", 10));
        lesSports.ajouterSport(new Sport("TNS", "Tenis"));
        lesSports.ajouterSport(new Sport("NAT", "Natation"));

        lesSports.afficheSports();
    }
}
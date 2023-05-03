package TP2;

public class Location {
    private static int count = 0;
    private int number;
    private Voiture voiture;
    private Client client;
    private Date startDate;
    private Date endDate;
    private int kilometers;

    public Location(Voiture voiture, Client client, Date startDate) {
        this.number = ++count;
        this.voiture = voiture;
        this.client = client;
        this.startDate = startDate;
        this.endDate = null;
        this.kilometers = voiture.getNbKilometres();
    }

    public void display() {
        System.out.println("Location #" + this.number);
        System.out.println("Voiture: " + this.voiture.getModele() + " " + this.voiture.getModele());
        System.out.println("Client: " + this.client.getNom() + " " + this.client.getDomicile());
        System.out.println("Start date: ");
        this.startDate.display();
        if (this.endDate == null) {
            System.out.println("Status: In progress");
        } else {
            System.out.println("End date: ");
            this.endDate.display();
            System.out.println("Kilometers driven: " + this.kilometers);
        }
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
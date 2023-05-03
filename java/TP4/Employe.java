package TP33;

public abstract class Employe /*implements Comparable<Employe>*/ {
    private static int cpt=0;

    private String nom;
    private int age;
    private int nb_A;
    private int id;

    public Employe(String nom, int age, int Nb_A){
        this.id = Employe.cpt++;
        this.nom=nom;
        this.age=age;
        this.nb_A=Nb_A;
    }

    public static int getCpt() {
        return cpt;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getNb_A() {
        return nb_A;
    }
    public void setNb_A(int nb_A) {
        this.nb_A = nb_A;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.nom + " [" + this.getClass().getSimpleName() + ".e - " + this.id + "] a " + this.age + " ans et est présent.e depuis " + this.nb_A + " ans. Iel est payé.e " + this.salaire() + "€. ";
    }

    public void afficher() {
        System.out.println(this);
    }

//	@Override
//	public int compareTo(Employe e) {
//		int res = -1;
//		if (this.salaire() > e.salaire()) {
//			res = 1;
//		} else if (this.salaire() == e.salaire()) {
//			res = 0;
//		}
//		return res;
//	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employe other = (Employe) obj;
        return id == other.id;
    }

    abstract int salaire();
}
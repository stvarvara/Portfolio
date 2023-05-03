package TP3;


    public class ChevalDeCourse extends Cheval{
        private int gains;
        private Entraineur entraineur;
        private Jockey jockey = null;

        public ChevalDeCourse(String nom, String sexe, String race, int gains, Entraineur entraineur) {
            super(nom, sexe, race);
            this.gains = gains;
            this.entraineur = entraineur;
        }

        public int getGains() {
            return gains;
        }

        public void setGains(int gains) {
            this.gains = gains;
        }

        public Entraineur getEntraineur() {
            return entraineur;
        }

        public void setEntraineur(Entraineur entraineur) {
            this.entraineur = entraineur;
        }

        public Jockey getJockey() {
            return jockey;
        }

        public void setJockey(Jockey jockey) {
            this.jockey = jockey;
        }

        @Override
        public String toString() {
            String res = super.toString() + ", il a remporté " + this.gains + "euros,\nentraineur : " + this.entraineur;
            if (jockey != null) {
                res += "\njockey : " + this.jockey;
            }
            return res;
        }

        public void affiche() {
            System.out.println(this);
        }

        public void attribueJockey(Jockey j) {
            if (jockey != null) {
                System.err.println("[W] Erreur, un jockey est déjà attribué à ce cheval");
            } else {
                this.jockey = j;
            }
        }
}
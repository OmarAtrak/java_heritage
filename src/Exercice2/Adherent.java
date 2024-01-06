package Exercice2;

public class Adherent extends Personne {
    private long numAdherent;

    public long getNumAdherent() {
        return numAdherent;
    }
    public void setNumAdherent(long numAdherent) {
        this.numAdherent = numAdherent;
    }

    public Adherent(String nom, String prenom, String email, String tel, int age, long numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }


    @Override
    public String toString() {
        return super.toString() + ", NumAdherent: " + numAdherent;
    }
}

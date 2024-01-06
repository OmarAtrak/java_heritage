package Exercice2;

public class Auteur extends Personne {
    private long numAuteur;

    public long getNumAuteur() {
        return numAuteur;
    }
    public void setNumAuteur(long numAuteur) {
        this.numAuteur = numAuteur;
    }

    public Auteur(String nom, String prenom, String email, String tel, int age, long numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return super.toString() + ", NumAuteur: " + numAuteur;
    }
}

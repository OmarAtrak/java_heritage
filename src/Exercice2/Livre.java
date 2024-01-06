package Exercice2;

public class Livre {
    private long ISBN;
    private String titre;
    private Auteur auteur;


    public long getISBN() {
        return ISBN;
    }
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }


    @Override
    public String toString() {
        return "ISBN: " + ISBN +
                ", titre: " + titre +
                ", Auteur{ " + auteur.toString() + " }";
    }
}

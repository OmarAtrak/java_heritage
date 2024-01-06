package Exercice3;

public class Vehicule {
    // attributes
    private String nom;
    private double prix;


    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }


    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    public void afficherInformations() {
        System.out.println("Nom: " + this.nom + ", Prix: " + this.prix);
    }

}

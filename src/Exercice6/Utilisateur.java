package Exercice6;

public class Utilisateur {
    private String nom;

    
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }


    public void emprunterObjet(Empruntable objet) {
        objet.emprunter();
    }
}

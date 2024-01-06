package Exercice3;

import java.util.Date;

public class Voiture extends Vehicule {
    private String modele;
    private Date annee;


    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }

    public Date getAnnee() {
        return annee;
    }
    public void setAnnee(Date annee) {
        this.annee = annee;
    }


    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Modele: " + this.modele + ", Annee: " + this.annee);
    }
}

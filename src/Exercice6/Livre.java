package Exercice6;

import Exercice2.Auteur;

public class Livre implements Empruntable {
    private String titre;
    private Auteur auteur;

    
    
    public String getTitre() {
        return this.titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteur getAuteur() {
        return this.auteur;
    }
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }



    @Override
    public void emprunter() {
        System.out.println("livre emprunter");
    }

    @Override
    public void retourner() {
        System.out.println("livre retourner");
    }
    
}

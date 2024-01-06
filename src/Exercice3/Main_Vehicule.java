package Exercice3;

import java.util.Date;

public class Main_Vehicule {
    public static void main(String[] args) {
        // Exercice 3

        Voiture voiture = new Voiture();
        voiture.setNom("voiture");
        voiture.setPrix(300000);
        voiture.setModele("Dacia");
        voiture.setAnnee(new Date());
        voiture.emettreSon();
        voiture.afficherInformations();

        System.out.println("----------------------------------------------------");

        Moto moto = new Moto();
        moto.setNom("moto");
        moto.setPrix(9000);
        moto.setMarque("m1");
        moto.setPuissance("p1");
        moto.emettreSon();
        moto.afficherInformations();

        System.out.println("----------------------------------------------------");

        Avion avion = new Avion();
        avion.setNom("avion");
        avion.setPrix(900000);
        avion.setCompagnie("Ryanair");
        avion.setVitesseMax("v1");
        avion.emettreSon();
        avion.afficherInformations();
    }
}
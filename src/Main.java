import Exercice1.Compte;
import Exercice2.Adherent;
import Exercice2.Auteur;
import Exercice2.Livre;
import Exercice3.Avion;
import Exercice3.Moto;
import Exercice3.Voiture;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Exercice 1

        /*Compte compteBancaire = new Compte();
        compteBancaire.setNumero("000248849");
        compteBancaire.deposer(5000);
        compteBancaire.retirer(1000);
        compteBancaire.afficherCompteInfo();
        System.out.println("Numero: " + compteBancaire.getNumero() + ", Solde: " + compteBancaire.getSolde());
        compteBancaire.retirer(6000);*/

        // ---------------------------------------------------------------------------//

        // Exercice 2

        /*Adherent adherent = new Adherent("Alami", "Ahmed", "alami.ahmed@gmail.com", "0601020304", 37, 2747);
        Auteur auteur = new Auteur("Hachimi", "Ali", "hachimi.ali@gmail.com", "0704030201", 32, 84211);
        Livre livre = new Livre();
        livre.setISBN(7573288);
        livre.setTitre("JAVA");
        livre.setAuteur(auteur);

        System.out.println(adherent);
        System.out.println(livre);*/

        // ---------------------------------------------------------------------------//

        // Exercice 3

        Voiture voiture = new Voiture();
        voiture.setNom("voiture");
        voiture.setPrix(300000);
        voiture.setModele("Dacia");
        voiture.setAnnee(new Date());
        voiture.emettreSon();
        voiture.afficherInformations();

        Moto moto = new Moto();
        moto.setNom("moto");
        moto.setPrix(9000);
        moto.setMarque("m1");
        moto.setPuissance("p1");
        moto.emettreSon();
        moto.afficherInformations();

        Avion avion = new Avion();
        avion.setNom("avion");
        avion.setPrix(900000);
        avion.setCompagnie("Ryanair");
        avion.setVitesseMax("v1");
        avion.emettreSon();
        avion.afficherInformations();
    }
}
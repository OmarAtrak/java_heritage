package Exercice1;

public class Main_Compte {
    public static void main(String[] args) {
        // Exercice 1

        Compte compteBancaire = new Compte();
        compteBancaire.setNumero("000248849");
        compteBancaire.deposer(5000);
        compteBancaire.retirer(1000);
        compteBancaire.afficherCompteInfo();
        System.out.println("Numero: " + compteBancaire.getNumero() + ", Solde: " + compteBancaire.getSolde());
        compteBancaire.retirer(6000);
    }
}

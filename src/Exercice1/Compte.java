package Exercice1;

public class Compte {
    // attributes
    private String numero;
    private double solde;
    private static int nbCompte = 0;


    // constructeur
    public Compte() {
        this.solde = 0;
        this.numero = "";
        nbCompte++;
    }


    // getters et setters
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }


    // methodes
    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) {
        if(montant <= this.solde) {
            this.solde -= montant;
        }
        else {
            System.out.println("Le solde est insuffisant !!");
        }
    }

    public void afficherCompteInfo() {
        System.out.println("Numero: " + this.numero + ", Solde: " + this.solde);
    }

    public static void afficherNbComptes() {
        System.out.println("nombre de comptes crées: " + nbCompte);
    }
}

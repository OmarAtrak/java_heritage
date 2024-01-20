package Exercice7;

public class Commande {
    private double montant;
    private Paiement typePaiement;


    public double getMontant() {
        return this.montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Paiement getTypePaiement() {
        return this.typePaiement;
    }
    public void setTypePaiement(Paiement moyenPaiement) {
        this.typePaiement = moyenPaiement;
    }

    public void processPayment() {
        this.typePaiement.effectuerPaiement(this.montant);
    }


}

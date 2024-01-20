package Exercice7;

public class Paiement {
    private double montant;
    private long numeroTransaction;


    public double getMontant() {
        return this.montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }

    public long getNumeroTransaction() {
        return this.numeroTransaction;
    }
    public void setNumeroTransaction(long numeroTransaction) {
        this.numeroTransaction = numeroTransaction;
    }

    
    
    public void effectuerPaiement(double montant) {
        System.out.println("Effectuer Paiement");
    }
}

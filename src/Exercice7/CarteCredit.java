package Exercice7;

public class CarteCredit extends Paiement {
    private long numeroCarte;


    public long getNumeroCarte() {
        return this.numeroCarte;
    }
    public void setNumeroCarte(long numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Effectuer Paiement avec Carte Credit");
    }
}

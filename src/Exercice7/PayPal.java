package Exercice7;

public class PayPal extends Paiement {
    private String email;


    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Effectuer Paiement avec PayPal");
    }
}

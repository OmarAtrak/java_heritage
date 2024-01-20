package Exercice7;

public class GestionPaiementApp {
    public static void main(String[] args) {
        Commande commande1 = new Commande();
        Commande commande2 = new Commande();
        CarteCredit carteCredit = new CarteCredit();
        PayPal paypal = new PayPal();

        commande1.setMontant(100);
        commande1.setTypePaiement(paypal);

        commande2.setMontant(1200);
        commande2.setTypePaiement(carteCredit);

        commande1.processPayment();
        commande2.processPayment();
    }
}

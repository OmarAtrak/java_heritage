package Exercice3;

public class Moto extends Vehicule {
    private String marque;
    private String puissance;


    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getPuissance() {
        return puissance;
    }
    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }


    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }
}

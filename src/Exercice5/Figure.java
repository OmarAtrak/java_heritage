package Exercice5;

public abstract class Figure {
    private String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();
    public abstract double calculerPerimetre();

    public void afficherDetails() {
        System.out.print(
            "Nom: " + this.nom + "\n" +
            "Aire: " + this.calculerAire() + "\n" +
            "Perimetre: " + this.calculerPerimetre() + "\n"
        );
    }
}

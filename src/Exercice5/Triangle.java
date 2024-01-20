package Exercice5;

public class Triangle extends Figure {
    private double hauteur;
    private double base;


    public Triangle(String nom, double hauteur, double base) {
        super(nom);
        this.hauteur = hauteur;
        this.base = base;
    }

    @Override
    public double calculerAire() {
        return (this.hauteur * this.base) / 2;
    }

    @Override
    public double calculerPerimetre() {
        return 0;
    }

}

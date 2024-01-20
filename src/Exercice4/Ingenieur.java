package Exercice4;

public class Ingenieur extends Employe {
    private String specialite;


    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Ingenieur() {}

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalire() {
        return this.getSalaire() + (this.getSalaire() * 0.15);
    }
}

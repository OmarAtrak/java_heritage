package Exercice4;

public abstract class Employe {
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private double salaire;


    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEnail() {
        return email;
    }
    public void setEnail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Employe() {}

    public Employe(String nom, String prenom, String email, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public abstract double calculerSalire();
}

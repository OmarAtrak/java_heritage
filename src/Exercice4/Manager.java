package Exercice4;

public class Manager extends Employe {
    private String service;


    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }

    public Manager() {}
    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalire() {
        return this.getSalaire() + (this.getSalaire() * 0.20);
    }
}

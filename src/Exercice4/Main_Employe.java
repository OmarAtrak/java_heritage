package Exercice4;

public class Main_Employe {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur("samir", "kamal", "kamal2414@gmail.com", "0601020304", 15000, "chef de projet");

        Manager manager = new Manager("kadiri", "hamza", "kadiri.hamza@gmail.com", "0604030201", 21000, "Directeur");

        System.out.println("Ingenieur { Nom: " + ingenieur.getNom() +
                                      ", Prenom: " + ingenieur.getPrenom() +
                                      ", Salaire: " + ingenieur.getSalaire() +
                                      ", Spécialité: " + ingenieur.getSpecialite());

        System.out.println("Manager { Nom: " + manager.getNom() +
                                      ", Prenom: " + manager.getPrenom() +
                                      ", Salaire: " + manager.getSalaire() +
                                      ", Service: " + manager.getService());
    }
}

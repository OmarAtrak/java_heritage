package Exercice6;

public class GestionBibliothequeApp {
    public static void main(String[] args) {
        Livre livre = new Livre();
        DVD dvd = new DVD();
        Utilisateur utilisateur = new Utilisateur();

        utilisateur.emprunterObjet(dvd);
        utilisateur.emprunterObjet(livre);
        
        livre.retourner();
        dvd.retourner();
    }
}

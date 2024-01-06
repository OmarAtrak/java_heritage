package Exercice2;

public class Main_Bibliotheque {
    public static void main(String[] args) {
        // Exercice 2

        Adherent adherent = new Adherent("Alami", "Ahmed", "alami.ahmed@gmail.com", "0601020304", 37, 2747);
        Auteur auteur = new Auteur("Hachimi", "Ali", "hachimi.ali@gmail.com", "0704030201", 32, 84211);
        Livre livre = new Livre();
        livre.setISBN(7573288);
        livre.setTitre("JAVA");
        livre.setAuteur(auteur);

        System.out.println(adherent);
        System.out.println(livre);
    }
}

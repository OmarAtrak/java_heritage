package Exercice6;

public class DVD implements Empruntable {

    @Override
    public void emprunter() {
        System.out.println("dvd emprunter");
    }

    @Override
    public void retourner() {
        System.out.println("dvd retourner");
    }
    
}

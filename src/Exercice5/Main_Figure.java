package Exercice5;

public class Main_Figure {
    public static void main(String[] args) {
        Figure f1 = new Cercle("c1", 7);
        Figure f2 = new Rectangle("r1", 7, 5);
        Figure f3 = new Triangle("t1", 4, 2.5);

        f1.afficherDetails();
        System.out.println("---------------------------------------");
        f2.afficherDetails();
        System.out.println("---------------------------------------");
        f3.afficherDetails();

    }
}

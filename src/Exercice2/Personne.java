package Exercice2;

public class Personne {
    // attributes
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;


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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    // constructeur
    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    // methodes

    @Override
    public String toString() {
        return "Nom: " + nom +
                ", Prenom: " + prenom +
                ", Email: " + email +
                ", Telephone: " + tel +
                ", Age: " + age;
    }
}

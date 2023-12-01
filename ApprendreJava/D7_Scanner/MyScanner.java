package D7_Scanner;

import java.util.Scanner;

public class MyScanner {

    // Les attributs
    String prenom = "", lieuNaissance = "";
    int age;
    
    // Les méhodes
    public void parler()
    {
        System.out.println("Je suis entrain de parler");
    }
    
    public static void main(String[] args) {
        // Création d'objet de notre scanner
        Scanner sc = new Scanner(System.in);

        // On demande user de saisir son prenom
        System.out.println("*********** Inscription ***************");
        System.out.println("Entrez votre prenom, lieu de naissance et age");

        // Stocker la saisie de user dans la var prenom
        MyScanner monObjet = new MyScanner();
        monObjet.prenom = sc.nextLine(); //recup du prenom saisi
        monObjet.lieuNaissance = sc.nextLine(); //recup du lieu saisi
        monObjet.age = sc.nextInt(); //recup de l'age saisi

        // On fermer le scanner
        sc.close();

        // Affichage du prénom saisi
        System.out.println("Bonjour " + monObjet.prenom + '\n' + "Tu as "
        + monObjet.age + " ans \n" + "Ton lieu de naisance est : " + monObjet.lieuNaissance);

        // Appelle de la méthode parler
        monObjet.parler();
    }
}

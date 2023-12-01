package D6_Package;
import java.util.Scanner;

public class Package {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Entrez votre nom");
        String nom = scanner.nextLine();
    
        System.out.println("Vous êtes : " + nom);
    }
}

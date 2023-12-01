package D10_LesMethodesChaine;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        String adresse;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer votre adresse");
        adresse = sc.nextLine();

        if (adresse.toLowerCase().indexOf("pikine") != -1) {
            System.out.println("Vous habitez à pikine");
        }
        else
        {
            System.out.println("Vous habitez à " + adresse);
        }
    }
    
}

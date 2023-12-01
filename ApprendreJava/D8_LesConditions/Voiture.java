package D8_LesConditions;

import java.util.Scanner;

public class Voiture {

    // Les attributs
    String marque = "", matricule = "", couleur ="", proprietaire, reponse = "";
    int nbPorte, nbPneu, nbPlace;
    
    public static void main(String[] args) {
        // Création objet de la classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Création objet de la classe Voiture
        Voiture maVoiture = new Voiture();

        System.out.println("Avez-vous une voiture - Oui ou Non");
        maVoiture.reponse = scanner.nextLine();

        if (maVoiture.reponse.equalsIgnoreCase("Oui")  || maVoiture.reponse.equalsIgnoreCase("Non")) {

            if (maVoiture.reponse.equalsIgnoreCase("Oui")) {
                // Recupération des saisies utilisateur
                System.out.println("🤣 ***************** Saississez les information de votre vcoiture *******************");
                System.out.println("");
 
                System.out.println("Entrer la marque de la voiture");
                maVoiture.marque = scanner.nextLine();

                System.out.println("Entrer le matricule de la voiture");
                maVoiture.matricule = scanner.nextLine();

                System.out.println("Entrer le Nom du proprietaire de la voiture");
                maVoiture.proprietaire = scanner.nextLine();

                System.out.println("Entrer la couleur de la voiture");
                maVoiture.couleur = scanner.nextLine();

                System.out.println("Entrer le nombre de porte de la voiture");
                maVoiture.nbPorte = scanner.nextInt();

                System.out.println("Entrer le nombre de pneu de la voiture");
                maVoiture.nbPneu = scanner.nextInt();

                System.out.println("Entrer le nombre de place de la voiture");
                maVoiture.nbPlace = scanner.nextInt();

                // Affichage des information
                System.out.println("************** Affichage ********************** ");
                System.out.println("");
                System.out.println("# Proprietaire : " + maVoiture.proprietaire);
                System.out.println("# Marque : " + maVoiture.marque);
                System.out.println("# Couleur : " + maVoiture.couleur);
                System.out.println("# matricule : " + maVoiture.matricule);
                System.out.println("# matricule : " + maVoiture.matricule);
                System.out.println("# Votre voiture a  : " + maVoiture.nbPneu + " pneus");
                System.out.println("# Votre voiture a  : " + maVoiture.nbPorte + " portes");
                System.out.println("# Votre voiture a  : " + maVoiture.nbPlace + " places");
            }
            else
            {
                System.out.println("Acces non autoirisé");
            }

        }
        else
        {
            System.out.println("Veuillez ecrire Oui ou Non");
        }


    }
}

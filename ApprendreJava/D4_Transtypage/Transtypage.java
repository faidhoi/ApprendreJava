package D4_Transtypage;

public class Transtypage {
   
    public static void main(String[] args) {
        // Transtypage automatique
        int baril = 12;
        System.out.println(baril);
        double maison = baril;
        System.out.println(maison); //12.0

        // Transtypage manuel
        double poids = 50.4d;
        int nbPneu = (int)poids;
        System.out.println("Le nombre de pneu est :" + nbPneu);
    }
}

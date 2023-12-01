package D5_Operateurs;

public class Logiques {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 4;
        // echappement
        String chaine = "Sidi va \"à\" l'ecole";

        if (a == b || c ==3) {
            System.out.println("ok");
        }

        a = 3;
        if(!(a == 3))
        {
             System.out.println("a != 3");
        }
        else
        {
             System.out.println("a = 3");
        }
    }
}

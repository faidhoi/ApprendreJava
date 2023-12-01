package D11_LesBoucle;

public class For {
    public static void main(String[] args) {
        String[] tabJours = {"Lundi", "Mardi", "Mercredi"};
        int i = 0;
        for (; ;) {
            if (i < tabJours.length) {
                System.out.println(tabJours[i]); //lundi mardi mer
                i++;
            }
        }
    }
}
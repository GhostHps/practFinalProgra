import java.util.Scanner;

public class Sequence {
    public static void show() {
        System.out.println("Serie");
        int max;
        int inSecuense = 2;

        System.out.println("¿Cuál será el valor máximo en la serie? ");
        Scanner theScanner = new Scanner(System.in);
        max = theScanner.nextInt();

        for (int i = 1; i <= max; i++) {
            if (i == 1) {
                System.out.print("1/" + inSecuense);
                inSecuense += 3;
            }

            if (i == 2) {
                System.out.print(" + 1/" + inSecuense);
                inSecuense += 2;
            }

            if (i == 3) {
                System.out.print(" + 1/" + inSecuense);
                inSecuense += 3;
                i = 1;
            }

            if (inSecuense > max) {
                break;
            }
        }
    }
}

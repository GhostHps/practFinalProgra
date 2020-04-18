import java.util.Scanner;

public class Perfects {
    public static void show() {
        int number = 0;

        Scanner theSCanner = new Scanner(System.in);
        number = Tools.getInt("un número");

        Tools.printTitle("Números perfectos desde 0 hasta " + number);
        for (int i = 0; i <= number; i++) {
            if (calcPerfectNumber(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean calcPerfectNumber(int number) {
        int suma = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                suma = suma + i;
            }
        }
        return suma == number;
    }
}

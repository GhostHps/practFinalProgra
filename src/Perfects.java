import java.util.Scanner;

public class Perfects {
    int sum = 0;
    int number = 0;

    public void show() {

        System.out.println("Serie de números perfectos");
        System.out.println("Ingresa un número a evaluar");
        Scanner theScanner = new Scanner(System.in);
        number = theScanner.nextInt();

        for (int i = 1; i < number; i++) {
            // i son los divisores. Se divide desde 1 hasta n-1
            if ((number % i) == 0) {
                // si es divisor se suma
                sum += i;
            }
        }
    }

    public boolean is() {
        if (sum == number) {
            // si el numero es igual a la suma de sus divisores es perfecto
            System.out.println("Es un número perfecto.");
        } else {
            System.err.println("No es un número perfecto.");
        }

        return false;
    }
}

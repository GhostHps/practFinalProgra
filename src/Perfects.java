import java.util.Scanner;

public class Perfects {
    /**
     * MEtodo que numero por numero, va dandoselos a la funcion de abajo, para que las evalue. Se imprimen los sumeros que si son perfectos
     */
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


    /**
     * Funcion que evalua los numeros que se le den, te dice si es o no es perfecto el numero
     *
     * @param number un numeo cualquiera a ser evaluado
     * @return un boleano que te indica si es o no perfecto
     */
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

package StadiumPOO;

import java.util.Scanner;

/**
 * clase principal del modulo
 */
public class MainS {
    public static void menu() {
        Stadium stadium = new Stadium();
        int election = 0;
        do {
            System.out.println("1.- Vender un boleto.");
            System.out.println("2.- Reporte de ventas");
            System.out.println("0.- Salir");

            Scanner theScanner = new Scanner(System.in);
            election = theScanner.nextInt();

            switch (election) {
                case 1:
                    stadium.generateSale();
                    break;
                case 2:
                    stadium.printReport();
                    break;
            }
        } while (election != 0);
    }
}

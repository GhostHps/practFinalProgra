import StadiumPOO.MainS;
import StadiumPOO.Stadium;
import flightReservations.MainFR;
import serviceCenter.MainSC;
import vineyard.MainVineyard;

import javax.swing.*;
import java.util.Scanner;

public class UiMenu {
    public static void menu() {
        Scanner theScanner = new Scanner(System.in);
        int election = 0;
        do {
            System.out.println("1.- Calificaciones");
            System.out.println("2.- Serie");
            System.out.println("3.- Perfectos");
            System.out.println("4.- Viñedo");
            System.out.println("5.- Estadio");
            System.out.println("6.- Viñedo POO");
            System.out.println("7.- Aviones");
            System.out.println("8.- Centro de servicio automotriz");
//            System.out.println("9.- Relación de composición");
//            System.out.println("10.- Documentacion");
            System.out.println("11.- Salir");

            election = theScanner.nextInt();
            switch (election) {
                case 1:
                    Score.show();
                    break;
                case 2:
                    Sequence.show();
                    break;
                case 3:
                    Perfects.show();
                    break;
                case 4:
                    Vineyard.show();
                    break;
                case 5:
                    MainS.menu();
                    break;
                case 6:
                    MainVineyard vineyard = new MainVineyard();
                    vineyard.show();
                    break;
                case 7:
                    MainFR.menu();
                    break;
                case 8:
                    MainSC.menu();
                    break;
                case 9:
                    break;
                case 10:
                    break;
            }
        } while (election != 11);
    }
}

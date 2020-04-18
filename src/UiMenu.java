import StadiumPOO.MainS;
import StadiumPOO.Stadium;
import flightReservations.MainFR;
import serviceCenter.MainSC;
import vineyard.MainVineyard;

import javax.swing.*;
import java.util.Scanner;

import static serviceCenter.Toolsc.ANSI_GREEN;
import static serviceCenter.Toolsc.ANSI_RESET;

public class UiMenu {
    public static void menu() {
        Scanner theScanner = new Scanner(System.in);
        int election = 0;
        do {
            Tools.padding();
            System.out.println("1.- Calificaciones");
            System.out.println("2.- Serie");
            System.out.println("3.- Perfectos");
            System.out.println("4.- Viñedo");
            System.out.println("5.- Estadio");
            System.out.println("6.- Viñedo POO");
            System.out.println("7.- Aviones");
            System.out.println("8.- Centro de servicio automotriz");
            System.out.println("9.- Relación de composición");
            System.out.println("10.- Documentacion");
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
                    MainFR mainFR = new MainFR();
                    mainFR.menu();
                    break;
                case 8:
                    MainSC mainSC = new MainSC();
                    mainSC.menu();
                    break;
                case 9:
                    Tools.printTitle("Relación de composición");
                    System.out.println("En esta parte del codigo, se presenta la composición de relación.");
                    System.out.println("El proyecto, desde un inicio estuvo diseñado para implementar este concepto, así que solo se mostrará otra iteración del pnuto 7");
                    System.out.println(Tools.ANSI_YELLOW + "\nPresione una tecla para continuar" + ANSI_RESET);
                    Tools.getString("una tecla");

                    MainFR compositionRelation = new MainFR();
                    compositionRelation.menu();
                    break;
                case 10:
                    System.out.println(ANSI_GREEN + "Si, el proyecto está documentado." + ANSI_RESET);
                    break;
            }
        } while (election != 11);
    }
}

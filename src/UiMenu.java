import serviceCenter.MainSC;

import java.util.Scanner;

public class UiMenu {
    public void menu() {
        Scanner theScanner = new Scanner(System.in);
        int election = theScanner.nextInt();
        do {
            System.out.println(
                    //"1- Calficaciones\n" +
                    //"2- Serie\n" +
//                    "3- Perfectos\n" +
//                    "4- Viñedo\n" +
//                    "5- Estadio\n" +
//                    "6- Viñedo con objetos\n" +
//                    "7- Estadio con objetos\n" +
                    "8- Centro de Servicio Automotriz\n" +
//                    "9- Relación composición\n" +
//                    "10- Documentación\n" +
                            "11-  Salir\n"
            );

            switch (election) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
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

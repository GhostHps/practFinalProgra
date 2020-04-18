package vineyard;

import serviceCenter.Toolsc;

public class MainVineyard {
    public void show() {
        int election = 0;
        Warehouse warehouse = new Warehouse();
        do {
            Toolsc.padding();
            System.out.println("1.- añadir un año al añejamiento");
            System.out.println("2.- Ver el total de litros por vino");
            System.out.println("3.- Ver el total de litros por año");
            System.out.println("4.- Año de mayor producción para el vino tipo 2");
            System.out.println("5.- ¿Ha habido un año en el que no se produjo vino del tipo 3?");
            System.out.println("0.- Salir");

            election = Toolsc.getOption();

            switch (election) {
                case 1:
                    warehouse.getYearAway();
                    break;
                case 2:
                    warehouse.getTotalPerVine();
                    break;
                case 3:
                    warehouse.getTotalPerYear();
                    break;
                case 4:
                    warehouse.majorType2();
                    break;
                case 5:
                    warehouse.ifNotProduceType3();
                    break;
            }
        } while (election != 0);
    }
}

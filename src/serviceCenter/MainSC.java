package serviceCenter;

import java.util.Scanner;

public class MainSC {
    public static void menu() {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("¿Cuál será nuestra capacidad máxima en el taller?");
        int howManyVehicles = theScanner.nextInt();
        ServiceCenter SC = new ServiceCenter(howManyVehicles);
        int election = 0;
        do {
            System.out.println("Bienvenido al servicio mecanico automotriz //Jama's//\n\n");
            System.out.println("1.- Ingresar vehículo al servicio.");
            System.out.println("2.- Retirar vehiculo del servicio.");
            System.out.println("3.- Reporte de vehiculos en servicio.");
            System.out.println("4.- Buscar vehículo");
            System.out.println("0.- Salir");

            election = theScanner.nextInt();

            switch (election) {
                case 1:
                    if (SC.getType()) {
                        Car aCar = new Car();
                        aCar = aCar.generateVehicle();
                        SC.getIn(aCar);
                    } else {
                        Motocycle aMoto = new Motocycle();
                        aMoto = aMoto.generateVehicle();
                        SC.getIn(aMoto);
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el id del vehiculo a retirar.");
                    int idToRetire = theScanner.nextInt();
                    try {
                        SC.getOut(SC.getVehicle(idToRetire));
                    } catch (Exception e) {
                        System.out.println("Vehiculo no encontrado.");
                    }
                    break;
                case 3:
                    SC.printGeneralServiceStatus();
                    break;
                case 4:
                    System.out.println("Ingresa el id del vehiculo a buscar.");
                    int idToSearch = theScanner.nextInt();
                    SC.searchVehicle(idToSearch);

            }
        } while (election != 0);
    }
}



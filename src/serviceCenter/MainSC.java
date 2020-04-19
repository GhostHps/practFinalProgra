package serviceCenter;

import java.util.Scanner;

/**
 * Metodo que maneja el menu del programa
 */
public class MainSC {
    public void menu() {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("¿Cuál será nuestra capacidad máxima en el taller?");
        int howManyVehicles = theScanner.nextInt();

        ServiceCenter SC = new ServiceCenter(howManyVehicles);
        int election = 0;

        do {
            Toolsc.printTitle("Servicio automotriz Jama´s");
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

                        if (!SC.getIn(aCar)) {
                            System.out.println("Por el momento no tenemos oportunidad de atenderlo. Vuelva pronto.");
                        }
                    } else {
                        Motocycle aMoto = new Motocycle();
                        aMoto = aMoto.generateVehicle();
                        if (!SC.getIn(aMoto)) {
                            System.out.println("Por el momento no tenemos oportunidad de atenderlo. Vuelva pronto.");
                        }
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
                    SC.searchVehicle(Toolsc.getInt("id del vehiculo"));

            }
        } while (election != 0);
    }
}



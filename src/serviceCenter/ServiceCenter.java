package serviceCenter;

import java.util.Scanner;

import static serviceCenter.Toolsc.*;

/**
 * Metodo del centro de servicio
 */
public class ServiceCenter {
    private Vehicle vehicles[];

    ServiceCenter(int howLong) {
        vehicles = new Vehicle[howLong];
    }

    /**
     * Metodo para agregar un nuevo auto al servicio
     * @param toGetIn Un vehiculo
     * @return un valor boleano que te confirma si si se pudo ingresar el vehiculo
     */
    protected boolean getIn(Vehicle toGetIn) {

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = toGetIn;

                try {
                    System.out.println(vehicles[i].printInformation());
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(ANSI_GREEN + "Gracias por confiar en nosotros. :)" + ANSI_RESET);
                Toolsc.padding();

                Toolsc.padding();
                return true;
            }

        }
        return false;
    }


    /**
     * MEtodo para sacar un vehiculo del servicio
     * @param toGetOut Vehiculo a sacar del servicio
     * @return
     */
    protected boolean getOut(Vehicle toGetOut) {
        boolean isGeted = false;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == toGetOut) {
                vehicles[i] = null;
                isGeted = true;
            }
        }
        return isGeted;
    }

    protected void printGeneralServiceStatus() {
        int countV = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                if (vehicle.isVerificated()) {
                    countV++;
                }

                System.out.println(vehicle.printInformation());
                Toolsc.padding();
            }
        }
        System.out.println("Número de vehiculos verificados: " + countV);
    }

    protected void searchVehicle(int toSearch) {
        try {
            System.out.println(vehicles[toSearch - 1].printInformation());
        } catch (Exception e) {
            System.out.println(ANSI_RED + "No hemos encontrado el vehiculo.\n" + e + ANSI_RESET);
        }
    }

    protected boolean getType() {
        System.out.println("¿Quieres ingresar un carro?");
        System.out.println("De responder negativo, se tomará como respuesta que quieres ingresar una moto.");
        System.out.println("Y/N\n");

        Scanner theScanner = new Scanner(System.in);
        String election = theScanner.nextLine();
        boolean toReturn;
        toReturn = election.equals("y");

        return toReturn;
    }

    protected Vehicle getVehicle(int id) {
        Vehicle toReturn = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                toReturn = vehicle;
            }
        }
        return toReturn;
    }
}

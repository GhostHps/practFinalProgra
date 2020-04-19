package serviceCenter;

import java.util.Scanner;

public class ServiceCenter {
    private Vehicle vehicles[];

    ServiceCenter(int howLong) {
        vehicles = new Vehicle[howLong];
    }

    protected boolean getIn(Vehicle toGetIn) {
        boolean isGeted = false;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                vehicles[i] = toGetIn;
                isGeted = true;
                System.out.println("Gracias por confiar en nosotros. :)");
            }
        }

        if (!isGeted) {
            System.out.println("Por el momento no tenemos oportunidad de atenderlo. Vuelva pronto.");
        }

        return isGeted;
    }

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
            }
        }
        System.out.println("Número de vehiculos verificados: " + countV);
    }

    protected void searchVehicle(int toSearch) {
        Scanner theScanner = new Scanner(System.in);

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == toSearch) {
                vehicle.printInformation();

                System.out.println("\n¿Desea borrar sacar el vehiculo del servicio? y/n");
                String election = theScanner.nextLine();
                if (election.equals("y")) {
                    try {
                        getOut(vehicle);
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                }
            }
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

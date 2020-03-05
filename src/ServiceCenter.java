import java.util.Scanner;

public class ServiceCenter {
    Vehicle vehicles[];

    ServiceCenter(int howLong) {
        vehicles = new Vehicle[howLong];
    }

    public boolean getIn(Vehicle toGetIn) {
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

    public boolean getOut(Vehicle toGetOut) {
        boolean isGeted = false;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == toGetOut) {
                vehicles[i] = null;
                isGeted = true;
            }
        }
        return isGeted;
    }

    public void printGeneralServiceStatus() {
        int countV = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                if (vehicles[i].isVerificated()) {
                    countV++;
                }

                System.out.println(vehicles[i].printInformation());
            }
        }
        System.out.println("Número de vehiculos verificados: " + countV);
    }

    public void searchVehicle(){
        System.out.println("Ingresa el id del vehiculo a buscar.");
        Scanner theScanner = new Scanner(System.in);
        int toSearch = theScanner.nextInt();

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
}

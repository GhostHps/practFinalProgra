package flightReservations;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFR {
    public static AirPlane aPlane = new AirPlane();
    public static ArrayList<Passenger> passengers = new ArrayList<>();

    public static void menu() {
        String election = "";
        do {
            System.out.println("¿Asignar silla a pasajero?");
            System.out.println("y = Sí; n = no; s = imprimir reporte de asientos.");

            Scanner theScanner = new Scanner(System.in);
            election = theScanner.nextLine();

            if (election.equals("y")) {
                Passenger aPassenger = new Passenger().generate();
                passengers.add(aPassenger);

                boolean doit = false;

                if (aPassenger.isPreferClass()) {
                    for (int i = 0; i < aPlane.executiveSeats.length; i++) {
                        if (aPlane.executiveSeats[i].getPassenger() == null && aPlane.executiveSeats[i].getPosition() == aPassenger.getPreferredSeat()) {
                            aPlane.executiveSeats[i].setPassenger(aPassenger);
                            System.out.println("Asiento ejecutivo no. " + aPlane.executiveSeats[i].getId() + " asignado.");
                            doit = true;
                            break;
                        }
                    }
                } else {
                    for (int i = 0; i < aPlane.economicSeats.length; i++) {
                        if (aPlane.economicSeats[i].getPassenger() == null && aPlane.economicSeats[i].getPosition() == aPassenger.getPreferredSeat()) {
                            aPlane.economicSeats[i].setPassenger(aPassenger);
                            System.out.println("Asiento no. " + aPlane.economicSeats[i].getId() + " asignado.");
                            doit = true;
                            break;
                        }
                    }
                }
                if (!doit) {
                    System.out.println("No hemos encontrado un asiento adecuado para el cliente, lo lamentamos.");
                }
            }

        } while (!election.equals("n"));
    }
}

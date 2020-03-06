package flightReservations;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFR {
    public AirPlane aPlane = new AirPlane();
    public ArrayList<Passenger> passengers = new ArrayList<>();

    public void menu() {
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
                String error = "";

                if (aPassenger.isPreferClass()) {
                    for (int i = 0; i < aPlane.executiveSeats.length; i++) {
                        if (aPlane.executiveSeats[i].getPassenger() == null && aPlane.executiveSeats[i].getPosition() == aPassenger.getPreferredSeat()) {
                            aPlane.executiveSeats[i].setPassenger(aPassenger);
                            System.out.println("Asiento no. " + aPlane.executiveSeats[i].getId() + " asignado.");
                            break;
                        }else {
                            System.out.println("No hemos encontrado un asiento adecuado para el cliente.");
                        }
                    }
                }else {
                    for (int i = 0; i < aPlane.economicSeats.length; i++) {
                        if (aPlane.economicSeats[i].getPassenger() == null && aPlane.economicSeats[i].getPosition() == aPassenger.getPreferredSeat()) {
                            aPlane.economicSeats[i].setPassenger(aPassenger);
                            System.out.println("Asiento no. " + aPlane.economicSeats[i].getId() + " asignado.");
                            break;
                        }else {
                            System.out.println("No hemos encontrado un asiento adecuado para el cliente.");
                        }
                    }
                }
            }

        } while (!election.equals("n"));
    }
}

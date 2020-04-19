package flightReservations;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Clase principal del modulo de asientos
 */
public class MainFR {
    public static AirPlane aPlane = new AirPlane();
    public static ArrayList<Passenger> passengers = new ArrayList<>();

    /**
     * MEtodo que muestra el menu del programa
     */
    public void menu() {
        String election = "";
        do {
            System.out.println("¿Asignar silla a pasajero?");
            System.out.println("y = Sí; n = no");

            Scanner theScanner = new Scanner(System.in);
            election = theScanner.nextLine();

            if (election.equals("y")) {

                /**
                 * Generamos un array de pasageros y vamos agregando a los pasageros que nos piden
                 */
                Passenger aPassenger = new Passenger().generate();
                passengers.add(aPassenger);

                boolean doit = false;

                /**
                 * Si la clase preferida del pasagero es ejecutiva, entra en este if
                 */
                if (aPassenger.isPreferClass()) {
                    for (int i = 0; i < aPlane.executiveSeats.length; i++) {

                        /**
                         * Si encuetra un asiento de la clase vacio en la posicion que el cliente prefiere, se lo asigna
                         */
                        if (aPlane.executiveSeats[i].getPassenger() == null && aPlane.executiveSeats[i].getPosition() == aPassenger.getPreferredSeat()) {
                            aPlane.executiveSeats[i].setPassenger(aPassenger);
                            System.out.println("Asiento ejecutivo no. " + aPlane.executiveSeats[i].getId() + " asignado.");
                            doit = true;
                            break;
                        }
                    }
                } else {
                    /**
                     * Si es economica, entra en el else
                     */
                    for (int i = 0; i < aPlane.economicSeats.length; i++) {

                        /**
                         * Si encuetra un asiento de la clase vacio en la posicion que el cliente prefiere, se lo asigna
                         */
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

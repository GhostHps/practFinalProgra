package flightReservations;

/**
 * Clase propia de un avion
 */
public class AirPlane {
    public Executive executiveSeats[] = new Executive[8];
    public Economic economicSeats[] = new Economic[42];

    /**
     * El constructor genera los asientos de acuerdo a sus categorias
     */
    AirPlane() {
        for (int i = 0; i < 8; i++) {
            executiveSeats[i] = new Executive();
        }
        for (int i = 0; i < 42; i++) {
            economicSeats[i] = new Economic();
        }


    }

}


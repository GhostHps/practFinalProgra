package flightReservations;

/**
 * Clase de los asientos ejecutivos
 */
public class Executive extends Seat {
    private static int it = 1;

    public Executive() {
        super(it);
        it++;
        if (it == 3) {
            it = 1;
        }
    }
}

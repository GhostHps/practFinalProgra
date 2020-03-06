package flightReservations;

public class Economic extends Seat {
    private static int it = 1;

    public Economic() {
        super(it);
        it++;
        if (it == 4) {
            it = 1;
        }
    }
}

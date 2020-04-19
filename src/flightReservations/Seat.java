package flightReservations;

/**
 * Clase propia de los asientos
 */
public abstract class Seat {
    private int id;
    private static int it = 1;
    private boolean disponibility = true;
    private Passenger passenger = null;
    private int position;

    public Seat(int position) {
        this.position = position;
        this.id = it;
        it++;
    }


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisponibility() {
        return disponibility;
    }

    public void setDisponibility(boolean disponibility) {
        this.disponibility = disponibility;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

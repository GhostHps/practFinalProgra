package flightReservations;

import java.util.Scanner;

public class Passenger {
    private int id;
    private static int it = 1;
    private String name;
    private String idCard;
    private int seatAssigned = 0;
//    private String dateOfBirth;

    //true = ejecutive; false = tourist
    private int preferredSeat;

    //true = ejecutive; false = tourist
    private boolean preferClass;

    public Passenger(String name, String idCard, int preferredSeat, boolean preferClass) {
        this.name = name;
        this.idCard = idCard;
        this.preferredSeat = preferredSeat;
        this.preferClass = preferClass;
        id = it;
        it++;
    }

    public Passenger(){
        id = it;
        it++;
    }

    public Passenger generate() {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("¿Cuál es el nombre del cliente?");
        this.name = theScanner.nextLine();

        System.out.println("¿Cuál es la cedula del cliente?");
        this.idCard = theScanner.nextLine();

        System.out.println("¿Cuál es la posición preferida del cliente?");
        System.out.println("1 = Ventana; 2 = pasillo; 3 = centro;");
        this.preferredSeat = theScanner.nextInt();

        System.out.println("¿Cuál es la clase preferida del cliente?");
        System.out.println("1 = Primera clase; 2 = económica;");
        int election = theScanner.nextInt();
        this.preferClass = election == 1;

        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getPreferredSeat() {
        return preferredSeat;
    }

    public void setPreferredSeat(int preferredSeat) {
        this.preferredSeat = preferredSeat;
    }

    public boolean isPreferClass() {
        return preferClass;
    }

    public void setPreferClass(boolean preferClass) {
        this.preferClass = preferClass;
    }

    public int getSeatAssigned() {
        return seatAssigned;
    }

    public void setSeatAssigned(int seatAssigned) {
        this.seatAssigned = seatAssigned;
    }
}

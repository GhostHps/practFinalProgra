import java.util.Scanner;

public class Car extends Vehicle {
    private int passengers;

    Car(String matricle, String brand, double mileage, int passengers) {
        super(matricle, brand, mileage);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String printInformation() {
        return super.printInformation() +
                "\nMáximo de pasajeros: " + this.getPassengers();
    }

    @Override
    public Vehicle generateVehicle() {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Ingresa la matricula.");
        this.setMatricle(theScanner.nextLine());

        System.out.println("Ingresa la Marca.");
        this.setBrand(theScanner.nextLine());

        System.out.println("Ingresa el kilometrage.");
        this.setMileage(theScanner.nextDouble());

        System.out.println("Ingresa el número máximo de pasajeros.");
        this.setPassengers(theScanner.nextInt());

        return this;
    }
}

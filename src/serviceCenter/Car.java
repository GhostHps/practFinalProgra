package serviceCenter;

import java.util.Scanner;

public class Car extends Vehicle {
    private int passengers;

    Car(String matricle, String brand, double mileage, int passengers) {
        super(matricle, brand, mileage);
        this.passengers = passengers;
    }

    Car() {

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
    public Car generateVehicle() {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Ingresa la matricula.");
        String matricle = theScanner.nextLine();

        System.out.println("Ingresa la Marca.");
        String brand = theScanner.nextLine();

        System.out.println("Ingresa el kilometrage.");
        double mileage = theScanner.nextDouble();

        System.out.println("Ingresa el número máximo de pasajeros.");
        int passengers = theScanner.nextInt();

        System.out.println();
        return new Car(matricle, brand, mileage, passengers);
    }
}

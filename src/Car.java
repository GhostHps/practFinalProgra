public class Car extends Vehicle {
    int passengers;

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
}

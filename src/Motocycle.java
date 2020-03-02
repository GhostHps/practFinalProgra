public class Motocycle extends Vehicle {
    //cilindrada
    double displacement;

    Motocycle(String matricle, String brand, double mileage, double displacement) {
        super(matricle, brand, mileage);
        this.displacement = displacement;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
}

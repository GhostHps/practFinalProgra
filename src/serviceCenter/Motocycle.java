package serviceCenter;

public class Motocycle extends Vehicle {
    //cilindrada
    private double displacement;

    Motocycle(String matricle, String brand, double mileage, double displacement) {
        super(matricle, brand, mileage);
        this.displacement = displacement;
    }

    Motocycle() {
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    @Override
    public String printInformation() {
        return super.printInformation() +
                "\nCilindrada: " + this.getDisplacement();
    }

    @Override
    public Motocycle generateVehicle() {
        String matricle = Toolsc.getString("matricula");
        String brand = Toolsc.getString("marca");
        float mileage = Toolsc.getFloat("kilometraje");
        int displacement = Toolsc.getInt("cilindrada");

        return new Motocycle(matricle, brand, mileage, displacement);
    }
}

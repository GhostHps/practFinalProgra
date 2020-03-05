import java.util.Scanner;

public abstract class Vehicle {
    private int id;
    private static int count = 1;
    private String matricle;
    private String brand;
    private double mileage;
    private boolean pollutionVerification;

    Vehicle(String matricle, String brand, double mileage) {
        this.matricle = matricle;
        this.brand = brand;
        this.mileage = mileage;
        this.setId(count);
        count++;
    }

    Vehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMatricle(String matricle) {
        this.matricle = matricle;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setpollutionVerification(boolean pollutionVerification) {
        this.pollutionVerification = pollutionVerification;
    }

    public String getMatricle() {
        return matricle;
    }

    public String getBrand() {
        return brand;
    }

    public double getMileage() {
        return mileage;
    }

    public String defineService() {
        String toReturn = "";

        if (mileage >= 10000 && mileage < 20000) {
            toReturn = "Cambio de aceite\n";
        } else if (mileage >= 20000 && mileage < 50000) {
            toReturn = "Cambio de filtros";
        } else if (mileage > 50000) {
            toReturn = "Cambio de llantas";
        } else {
            toReturn = "";
        }

        return toReturn;
    }

    public boolean isVerificated() {
        return pollutionVerification;
    }

    public String printInformation() {
        return "ID: " + this.getId() +
                "\nMatricula: " + this.getMatricle() +
                "\nMarca: " + this.getBrand() +
                "\nKilometrage: " + this.getMileage() +
                "\nEstado de verificación: " + this.isVerificated();
    }

    public Vehicle generateVehicle() {
        return null;
    }
}

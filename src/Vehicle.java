public abstract class Vehicle {
    String matricle;
    String brand;
    double mileage;
    boolean pollutionVerification;

    Vehicle(String matricle, String brand, double mileage) {
        this.matricle = matricle;
        this.brand = brand;
        this.mileage = mileage;
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
}

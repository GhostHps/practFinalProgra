package serviceCenter;

/**
 * Clase abstracta propia de los vehiculos
 */
public abstract class Vehicle {
    private int id;
    private static int count = 1;
    private String matricle;
    private String brand;
    private double mileage;
    private boolean pollutionVerification;


    /**
     * Constructor de vehiculos
     *
     * @param matricle matricula
     * @param brand    marca
     * @param mileage  kilometraje
     */
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

    /**
     * Clase que define el servicio que se le tiene que dar a los vehiculos
     *
     * @return Un string con el servicio requerido
     */
    public String defineService() {
        String toReturn = "";

        if (mileage >= 10000 && mileage < 20000) {
            toReturn = "Cambio de aceite\n";
        } else if (mileage >= 20000 && mileage < 50000) {
            toReturn = "Cambio de filtros";
        } else if (mileage > 50000) {
            toReturn = "Cambio de llantas";
        } else {
            toReturn = "ninguno";
        }

        return toReturn;
    }

    /**
     * Metodo que me dice si está veirificado, no se llama get, así que no cuenta:v
     *
     * @return si está o no verificado
     */
    public boolean isVerificated() {
        if (pollutionVerification) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que imprime la informacion del vehiculo.
     * Si, podría haber sido sobreescrito el toString, pero cuando hice este ejercicio no sabía bien eso xd
     *
     * @return string con los valores del vehiculo
     */
    public String printInformation() {
        return "ID: " + this.getId() +
                "\nMatricula: " + this.getMatricle() +
                "\nMarca: " + this.getBrand() +
                "\nKilometrage: " + this.getMileage() +
                "\nEstado de verificación: " + this.pollutionVerification +
                "\nServicio requerido: " + this.defineService();
    }

    /**
     * Metodo que genera un vehiculo nuevo
     * Si se le invoca directamente desde la clase vehicle, regresa un objeto nulo, cosa que no debería de pasar porque es una clase abstracta
     *
     * @return el vehiculo generado
     */
    public Vehicle generateVehicle() {
        return null;
    }
}

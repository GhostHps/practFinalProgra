import java.util.Scanner;

public class Motocycle extends Vehicle {
    //cilindrada
    private double displacement;

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

    @Override
    public String printInformation() {
        return super.printInformation() +
                "\nCilindrada: " + this.getDisplacement();
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

        System.out.println("Ingresa el número de la cilindrada.");
        this.setDisplacement(theScanner.nextInt());

        return this;
    }
}

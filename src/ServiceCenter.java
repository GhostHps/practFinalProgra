public class ServiceCenter {
    Vehicle vehicles[];

    ServiceCenter(int howLong) {
        vehicles = new Vehicle[howLong];
    }

    public boolean getIn(Vehicle toGetIn) {
        boolean isGeted = false;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                vehicles[i] = toGetIn;
                isGeted = true;
                System.out.println("Gracias por confiar en nosotros. :)");
            }
        }

        if (!isGeted) {
            System.out.println("Por el momento no tenemos oportunidad de atenderlo. Vuelva pronto.");
        }

        return isGeted;
    }

    public boolean getOut(Vehicle toGetOut) {
        boolean isGeted = false;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == toGetOut) {
                vehicles[i] = null;
                isGeted = true;
            }
        }
        return isGeted;
    }

    public void printGeneralServiceStatus() {
        //Usar polimorfismo donde preparemos el string a imprimir con los datos de cada objeto.


        int countV = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                String isV = "";
                if (vehicles[i].isVerificated()) {
                    isV = "verificado";
                    countV++;
                } else {
                    isV = " sin verificar.";
                }

                System.out.println("Matricula: " + vehicles[i].getMatricle());
                System.out.println("Marca: " + vehicles[i].getBrand());
                System.out.println("Kilometrage: " + vehicles[i].getMileage());
                System.out.println("Estado de verificación: " + isV);

                if (vehicles[i] instanceof Car) {
                    Car aCar = (Car) vehicles[i];
                    System.out.println("Número de asientos: " + aCar.getPassengers());
                } else {
                    Motocycle aMotocycle = (Motocycle) vehicles[i];
                    System.out.println("Cilindrada: " + aMotocycle.getDisplacement());
                }
            }
        }
        System.out.println("Número de vehiculos verificados: " + countV);
    }
}

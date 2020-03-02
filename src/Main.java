public class Main {
    public static void main(String[] args) {

        Vehicle cars[] = new Vehicle[1];

        cars[0] = new Car("1111", "caca", 21212, 2);

        System.out.println(cars[0].getBrand());

        if (cars[0] instanceof Car){

            System.out.println("Si es carro");
            Car aCar = (Car) cars[0];
            System.out.println(aCar.getPassengers());
        }

    }


}

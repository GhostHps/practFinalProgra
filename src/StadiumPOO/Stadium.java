package StadiumPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Stadium {
    private Locality ticketType[] = new Locality[5];
    private ArrayList<Tickets> sold = new ArrayList<>();
    private int[] count = new int[5];

    Stadium() {
        this.generateLocalitys();
        for (int i : count) {
            i = 0;
        }
    }

    public void generateSale() {
        System.out.println("En que localidad venderás el boleto? ( 1 - 5)");
        Scanner theScanner = new Scanner(System.in);
        int locality = theScanner.nextInt();
        Tickets aSale = new Tickets(getLocality(locality));
        System.out.println("Vendido. Importe: " + aSale.getLocality().getPrice());
        sold.add(aSale);

    }

    private void generateLocalitys() {
        for (int i = 0; i < ticketType.length; i++) {
            System.out.println("Ingresa el precio de la localidad " + (i + 1));
            Scanner theScanner = new Scanner(System.in);
            Locality aux = new Locality((i + 1), theScanner.nextFloat());
            ticketType[i] = aux;
            System.out.println("Hecho");
        }
    }

    private Locality getLocality(int id) {
        Locality toReturn = null;
        for (Locality locality : ticketType) {
            if (locality.getId() == id) {
                this.count[id - 1] += 1;
                toReturn = locality;
            }
        }
        return toReturn;
    }

    public void printReport() {
        float suma = 0;
        for (Tickets ticket : sold) {
            suma += ticket.getLocality().getPrice();
        }
        System.out.println("Ganancia total de: " + suma);
        int counter = 1;
        for (int i : count) {
            System.out.println("Localidad " + counter + " ha vendido " + i + " boletos.");
            counter++;
        }
    }
}

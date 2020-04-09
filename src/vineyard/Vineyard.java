package vineyard;

import java.util.Scanner;

public class Vineyard {
    int id;
    static int it = 1;
    int aux = 1;
    int aux2 = 0;
    int maxYear = 0;
    int lessType3 = 0;
    int year;
    int time;

    Vineyard() {
        this.id = it;
        it++;
        System.out.println("Ingresa los litros del vino del tipo: " + id);
        Scanner theScanner = new Scanner(System.in);
        this.year = theScanner.nextInt();
    }

    public void operate(int add, Vineyard[] hola, int i) {
        System.out.println("La suma del año " + aux + " es:" + add);
        aux++;

        if (hola[i].aux > aux2) {
            aux2 = hola[2].year;
            maxYear = year - 1;
        }

        if (hola[i].year == 0) {
            lessType3 = year - 1;
        }
        if (i == 4) {
            System.out.println("Año en que se produjo la mayor cantidad de litros tipo 2: " + maxYear);
            System.out.println("Total de litros tipo dos en ese año: " + aux2);
            System.out.println("Año en el que no se produjo vino del tipo tres: " + lessType3);
        }
    }
}
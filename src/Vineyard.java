import java.util.Scanner;

public class Vineyard {
    public static void show() {
        int aux = 1;
        int aux2 = 0;

        int maxYear = 0;
        int lessType3 = 0;

        Scanner theScanner = new Scanner(System.in);
        System.out.println("¿Por cuantos años se añejará?");
        int time = theScanner.nextInt();

        for (int i = 0; i < time; i++) {
            System.out.println("Ingrese los litros de vino del tipo 1");
            int type1 = theScanner.nextInt();
            System.out.println("Ingrese los litros de vino del tipo 2");
            int type2 = theScanner.nextInt();
            System.out.println("Ingrese los litros de vino del tipo 3");
            int type3 = theScanner.nextInt();
            System.out.println("Ingrese los litros de vino del tipo 4");
            int type4 = theScanner.nextInt();
            System.out.println("Ingrese los litros de vino del tipo 5");
            int type5 = theScanner.nextInt();

            int add = type1 + type2 + type3 + type4 + type5;
            System.out.println("La suma del año " + aux + " es:" + add);
            aux++;

            if (type2 > aux2) {
                aux2 = type2;
                maxYear = aux - 1;
            }

            if (type3 == 0) {
                lessType3 = aux - 1;
            }
        }

        System.out.println("Año en que se produjo la mayor cantidad de litros tipo 2: " + maxYear);
        System.out.println("Total de litros tipo dos en ese año: " + aux2);
        System.out.println("Año en el que no se produjo vino del tipo tres: " + lessType3);
    }
}
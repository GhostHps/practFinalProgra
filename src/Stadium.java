import java.util.Scanner;

public class Stadium {
//    Realice un programa utilizando el paradigma orientado a objetos.
//    En un estadio se tienen 5 tipos diferentes de localidades,
//    las cuales se identifican por una clave numérica que es un valor
//    comprendido entre 1 y 5. Los precios de cada localidad y los datos
//    referentes a las ventas de boletos para el próximo juego se proporciona como sigue:
//    a)	Lea los precios.
//    b)	Lea los datos de las ventas de boletos.
//    c)	Imprima de cada venta, la clave, cantidad y el importe
//    total de los boletos vendidos en esta venta.
//    d)	Calcule e imprima la cantidad de boletos vendidos de cada tipo.
//    e)	Calcule e imprima la recaudación total del estadio.
//    NOTA: Considere que en una venta, solo se venden boletos de un solo tipo.

    double priceZoneA;
    double priceZoneB;
    double priceZoneC;
    double priceZoneD;
    double priceZoneE;

    Stadium() {
        Scanner theScanner = new Scanner(System.in);

        System.out.println("Ingrese el precio de la zona A. ");
        priceZoneA = theScanner.nextFloat();

        System.out.println("Ingrese el precio de la zona 2. ");
        priceZoneB = theScanner.nextFloat();

        System.out.println("Ingrese el precio de la zona 3. ");
        priceZoneC = theScanner.nextFloat();

        System.out.println("Ingrese el precio de la zona 4. ");
        priceZoneD = theScanner.nextFloat();

        System.out.println("Ingrese el precio de la zona 5. ");
        priceZoneE = theScanner.nextFloat();
    }

    float zona1, zona2, zona3, zona4, zona5, prec_tot = 0;
    String r;
    int boletos, cantb = 0, zona, totalb = 0, total = 0;

    public void stadium() {
        System.out.println("�Cuantos boletos deseas comprar");
        boletos = sc.nextInt();

        for (int i = 0; i < boletos; i++) {
            System.out.println("�Para que zona quiere el boleto?");
            System.out.println("zona 1 \n"
                    + "zona 2 \n"
                    + "zona 3 \n"
                    + "zona 4 \n"
                    + "zona 5 \n");
            zona = sc.nextInt();

            switch (zona) {

                case 1:
                    System.out.println("�Cuantos boletos desea comprar para esta zona");
                    cantb = sc.nextInt();
                    if (cantb <= boletos) {
                        prec_tot = zona1 * cantb;
                    }
                    total = cantb;
                    break;
                case 2:

                    System.out.println("�Cuantos boletos desea comprar para esta zona");
                    cantb = sc.nextInt();
                    if (cantb <= boletos) {
                        prec_tot = zona2 * cantb;
                    }
                    total = cantb;
                    break;
                case 3:

                    System.out.println("�Cuantos boletos desea comprar para esta zona");
                    cantb = sc.nextInt();
                    if (cantb <= boletos) {
                        prec_tot = zona3 * cantb;
                    }
                    total = cantb;
                    break;
                case 4:

                    System.out.println("�Cuantos boletos desea comprar para esta zona");
                    cantb = sc.nextInt();
                    if (cantb <= boletos) {
                        prec_tot = zona4 * cantb;
                    }
                    total = cantb;
                    break;
                case 5:
                    System.out.println("�Cuantos boletos desea comprar para esta zona");
                    cantb = sc.nextInt();
                    if (cantb <= boletos) {
                        prec_tot = zona5 * cantb;
                    }
                    total = cantb;
                    break;
                default:
                    break;
            }
            totalb += cantb;
            System.out.println("La clave de esta venta es: ");
            System.out.println("el total de esta venta fue de: " + cantb);
            System.out.println("La cantidad de los boletos vendidos fue de: " + total);
            cantb = 0;
            prec_tot = 0;

        }
    }
}


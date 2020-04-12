public class Vineyard {
    public static void show() {
        /*
        Opción 4:
Realice un programa utilizando el paradigma estructurado.
En una bodega se tiene información sobre las cantidades producidas de cada tipo de vino, a lo largo de los últimos años. Calcule e imprima lo siguiente:
a)	El total producido de cada tipo de vino (son 5 tipos) a lo largo de los N años.
b)	El total producido de vino por año.
c)	Año en que se produjo la mayor cantidad de litros de vino del tipo 2. Imprimir también la cantidad de litros.
d)	Verificar si hubo algún año en el cual no se produjo el vino tipo 3. Si existe dicho año imprimirlo.
         */

        System.out.println("¿Cuantos años tendrán los vinos de añejamient?");
        float howOld = Tools.getFloat("años de añejamiento");
        float maxyer = -1;
        float ltOfMasYear = -1;
        float yearless = -1;
        float totalProduction = 0;

        for (int i = 0; i < howOld; i++) {
            float type1 = Tools.getFloat("los litros del vino tipo 1 en el año " + (i + 1));
            float type2 = Tools.getFloat("los litros del vino tipo 2 en el año " + (i + 1));
            float type3 = Tools.getFloat("los litros del vino tipo 3 en el año " + (i + 1));
            float type4 = Tools.getFloat("los litros del vino tipo 4 en el año " + (i + 1));
            float type5 = Tools.getFloat("los litros del vino tipo 5 en el año " + (i + 1));

            float add = type1 + type2 + type3 + type4 + type5;
            totalProduction += add;
            System.out.println("La producción del año fue de: " + add + "lt");

            if (ltOfMasYear < type2) {
                ltOfMasYear = type2;
                maxyer = i;
            }

            if (type3 == 0) {
                yearless = i;
            }
        }

        System.out.println(Tools.ANSI_GREEN + "La producción total de todos los años, fue de : " + totalProduction + "lt" + Tools.ANSI_RESET);
        if (yearless != -1) {
            System.out.println("En el año " + yearless + " se produjeron 0 lt de vino del tipo 3");
        }
        System.out.println("En el año " + maxyer + " se producjeron " + ltOfMasYear + " lt y fue el año que mas producción del tipo 2 hubo.");

    }


//    Do you think that if life fulfilled wishes, it would live?

    /*
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

            if (type2 > aux2) {
                aux2 = type2;
                maxYear = i;
            }

            if (type3 == 0) {
                lessType3 = aux - 1;
            }
        }

        System.out.println("Año en que se produjo la mayor cantidad de litros tipo 2: " + maxYear);
        System.out.println("Total de litros tipo dos en ese año: " + aux2);
        System.out.println("Año en el que no se produjo vino del tipo tres: " + lessType3);
    }
     */
}
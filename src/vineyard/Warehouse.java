package vineyard;

import serviceCenter.Toolsc;

public class Warehouse {
    private Vine vines[] = new Vine[5];
    double totalPerVine[] = new double[5];
    double totalPerYear[];
    private int yearsAway;

    public Warehouse() {
        for (int i = 0; i < vines.length; i++) {
            vines[i] = new Vine();
        }
        this.yearsAway = 0;
        this.getYearAway();
    }

    public Vine[] getVines() {
        return vines;
    }

    public void setVines(Vine[] vines) {
        this.vines = vines;
    }

    public void getYearAway() {
        this.yearsAway++;
        for (int i = 0; i < vines.length; i++) {
            double lts = Toolsc.getFloat("litros producidos en el año " + this.yearsAway + " del vino tipo " + (i + 1));
            vines[i].lpyPlus(lts);
            totalPerVine[i] += lts;
        }
    }

    public void getTotalPerVine() {
        /*
        double totalPerVine[] = new double[5];
        for (int i = 0; i < totalPerVine.length; i++) {
            for (Barrel barrel : this.vines[i].getLpy()) {
                totalPerVine[i] += barrel.getLt();
                System.out.println(totalPerVine[i]);
            }
        }
*/
        Toolsc.printTitle("Reporte de producción en " + this.yearsAway + " años");
        for (int i = 0; i < totalPerVine.length; i++) {
            System.out.println("La producción total del vino tipo " + (i + 1) + ", fue de " + totalPerVine[i] + " lt.");
        }
    }

    public void getTotalPerYear() {
        this.totalPerYear = new double[yearsAway];
        Toolsc.printTitle("Reporte de producción por años");

//        System.out.println(this.totalPerYear.length);
//        System.out.println(vines[1].getLpy().size());


        for (int i = 0; i < this.totalPerYear.length; i++) {
            this.totalPerYear[i] = 0;
            for (Vine vine : this.vines) {
//                System.out.println(i);
                this.totalPerYear[i] += vine.getLpy().get(i).getLt();
            }
            System.out.println("Producción total de vino en el año " + (i + 1) + ", fue de " + this.totalPerYear[i] + " lt");
        }
    }

    public void majorType2() {
        int majorYear = -1;
        double majorLt = 0;
        for (Barrel barrel : vines[1].getLpy()) {
            if (barrel.getLt() > majorLt) {
                majorLt = barrel.getLt();
                majorYear = vines[1].getLpy().indexOf(barrel);
            }
        }

        System.out.println("El año que mayor producción del vino tipo 2 hubo, fue el año número " + (majorYear + 1) + " con " + majorLt + " lt");
    }

    public void ifNotProduceType3() {
        for (Barrel barrel : vines[2].getLpy()) {
            if (barrel.getLt() == 0) {
                System.out.println("En el año " + (vines[2].getLpy().indexOf(barrel) + 1) + " no hubo producción del vino tipo 3");
            }
        }
    }
}
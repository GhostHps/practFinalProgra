package vineyard;

import java.util.Scanner;

public class MainVineyard {
    Vineyard vineyard[] = new Vineyard[5];
    int time = 0;
    int id;
    static int it = 1;
    int aux = 1;
    int aux2 = 0;
    int maxYear = 0;
    int lessType3 = 0;
    int year;


    public void show() {
        System.out.println("¿Por cuantos años se añejará?");
        Scanner theScanner = new Scanner(System.in);
        time = theScanner.nextInt();

        for (int i = 0; i < vineyard.length; i++) {
            Vineyard vine = new Vineyard();
            vine.time = time;
            vineyard[i] = vine;
        }

        int add = 0;
        for (int i = 0; i < vineyard.length; i++) {
            add += vineyard[i].year;
        }

        for (int i = 0; i < vineyard.length; i++) {
            vineyard[i].operate(add, vineyard, i);
        }
    }
}

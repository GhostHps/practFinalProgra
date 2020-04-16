package vineyard;

import java.util.Scanner;


/**
 * TENGO QUE REVISAR BIEN ESTE CODIGO
 */
public class MainVineyard {
    Vineyard vineyard[] = new Vineyard[5];
    int time = 0;


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
        for (Vineyard value : vineyard) {
            add += value.year;
        }

        for (int i = 0; i < vineyard.length; i++) {
            vineyard[i].operate(add, vineyard, i);
        }
    }
}

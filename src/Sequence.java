/**
 * En el punto 2, pedimos un numero que será el maximo de una secuencia en la cual irá mostrando uno por uno en la secuencia, el numero en la iteración como dividendo de 1.
 */
public class Sequence {
    public static void show() {
        Tools.padding();
        System.out.println("Secuencia");
        int top = Tools.getInt("tope de la secuencia");
        int it = 0;
        boolean value = false;

        do {
            if (value) {
                it += 3;
            } else {
                it += 2;
            }
            System.out.print("1/" + it + " ");

            value = !value;
        } while (it < top);
    }
}

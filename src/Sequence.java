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

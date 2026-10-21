import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {

        int opciones;
        double subtotal = 0;
        Scanner input = new Scanner(System.in);

        while (true) {

            String cadena = """
                    1. Café ($4000)
                    2. Muffin ($3.500)
                    3. Sandwich ($7.500)
                    4. Jugo ($5.000)
                    5. Té ($3.000)
                    6. Salir""";
            System.out.println("--- Menú de la Cafetería --- \n " + cadena);
            System.out.println("Elige una opción: ");
            opciones = input.nextInt();

            if (opciones == 1) {
                double cafe = 4000;
                subtotal += cafe;
                System.out.println("Compraste un Café ->: " + "$" + subtotal);
            } else if (opciones == 2) {
                double muffin = 3500;
                subtotal += muffin;
                System.out.println("Compraste un Muffin ->: " + "$" + subtotal);
            } else if (opciones == 3) {
                double sandwich = 7500;
                subtotal += sandwich;
                System.out.println("Compraste un Sandwich ->: " + "$" + subtotal);
            } else if (opciones == 4) {
                double jugo = 5000;
                subtotal += jugo;
                System.out.println("Compraste un Jugo ->: " + "$" + subtotal);
            } else if (opciones == 5) {
                double te = 3000;
                subtotal += te;
                System.out.println("Compraste un Té ->: " + "$" + subtotal);
            } else if (opciones == 6) {
                System.out.println("Salir");
                break;
            } else {
                System.out.println("Opción inválida");
            }
        }
        System.out.println("Total Compra: " + "$" + subtotal);
    }
}

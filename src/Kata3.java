import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double subtotal = 0;
        double precio;
        int cantidad = 0;
        double IVA = 0.19;

        System.out.print("Ingresa el precio del producto (0 para terminar): ");
        precio = input.nextDouble();

        while(precio != 0) {
            subtotal += precio;
            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = input.nextDouble();
        }

        double calcularIVA = subtotal * IVA;
        double total = calcularIVA +  subtotal;

        if (total >= 50000){
            double descuento = total * 0.10;
            double totalFinal =  total - descuento;
            System.out.println("Subtotal: " + subtotal);
            System.out.println("IVA (19%): " + "$" + calcularIVA);
            System.out.println("Total: " + "$" + total);
            System.out.println("Descuento (10%): " + "$" + descuento);
            System.out.println("Totala pagar: " + "$" + totalFinal);
        } else {
            System.out.println("Subtotal: " + subtotal);
            System.out.println("IVA (19%): " + "$" + calcularIVA);
            System.out.println("Total: " + "$" + total);
        }

        input.close();

    }
}

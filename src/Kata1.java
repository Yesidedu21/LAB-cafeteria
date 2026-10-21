import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        /*Los clientes de la cafetería quieren dejar propina. Debes calcular la
        propina basada en el total de la cuenta. */

        float totalCuenta;
        float propina;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el total de la cuenta: ");
        totalCuenta = input.nextInt();
        System.out.println("Ingresa el porcentaje de propina: ");
        propina = input.nextInt();

        float porcentajePropina = propina / 100;
        float totalPropina = totalCuenta * porcentajePropina;
        float totalPagar = totalCuenta + totalPropina;

        if (totalCuenta > 0 && propina >= 0 && propina <= 100){
            if (propina >= 5 && propina <= 30){
                System.out.println("Propina: " + "$"+ totalPropina);
                System.out.println("Total a pagar: " + "$"+ totalPagar);
            } else if (propina >= 30) {
                System.out.println("Propina: " + "$"+ totalPropina);
                System.out.println("Total a pagar: " + "$"+ totalPagar);
                System.out.println("¡Propina generosa!");
            } else {
                System.out.println("Propina: " + "$"+ totalPropina);
                System.out.println("Total a pagar: " + "$"+ totalPagar);
                System.out.println("Propina muy baja");
            }
        } else {
            System.out.println("Error");
        }

        input.close();
    }
}

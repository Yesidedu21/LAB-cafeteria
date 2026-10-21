import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args) {
        int horaActual;
        int clientesAtendidos;
        int totalClientes = 0;
        int contadorHoras = 0;
        int maxClientes = -1;
        int horaPico = -1;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la hora (0-23, -1 para terminar): ");
        horaActual = input.nextInt();

        while(horaActual != -1){
            System.out.println("Ingresa el número de clientes en esa hora: ");
            clientesAtendidos = input.nextInt();

            totalClientes += clientesAtendidos;
            contadorHoras++;

            if (clientesAtendidos > maxClientes) {
                maxClientes = clientesAtendidos;
                horaPico = horaActual;
            }

            System.out.print("Ingrese la hora (0-23, -1 para terminar): ");
            horaActual = input.nextInt();
        }

        double promedioPorHoras = totalClientes / contadorHoras;

        System.out.println("--- Reporte de Clientes ---");
        System.out.println("Total de clientes: " + totalClientes);
        System.out.println(String.format("Promedio por hora: %.2f", promedioPorHoras));
        System.out.println("Hora con más clientes: " + horaPico + " (" + maxClientes + " Clientes)" );

    }
}

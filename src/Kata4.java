import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {

        int DiaSemana;
        int HoraSemana;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el día (1=Lunes, 7=Domingo): ");
        DiaSemana = input.nextInt();

        switch (DiaSemana) {
            case 1,2,3,4,5 -> {
                System.out.println("Ingresa la hora (0-23): ");
                HoraSemana = input.nextInt();

                if (HoraSemana >= 6 && HoraSemana < 20) {
                    System.out.println("La cafetería está abierta");
                } else {
                    System.out.println("La cafetería está cerrada");
                    System.out.println("Horario de Lunes: 6:00 AM - 8:00 PM ");
                }
            }
            case 6 -> {
                System.out.println("Ingresa la hora (0-23): ");
                HoraSemana = input.nextInt();
                if (HoraSemana >= 7 && HoraSemana < 14) {
                    System.out.println("La cafetería está abierta.");
                } else {
                    System.out.println("La cafetería está cerrada");
                    System.out.println("Horario de Lunes: 7:00 AM - 2:00 PM ");
                }
            }
            case 7 -> {
                System.out.println("Ingresa la hora (0-23): ");
                HoraSemana = input.nextInt();
                System.out.println("Cerrada (Domingos cerrado)");
            }
            default -> {
                System.out.println("Error: día inválido");
            }
        }
    }
}

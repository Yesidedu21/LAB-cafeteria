import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {

        String nombreBebida;
        double temperatura;

        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la bebida: ");
        nombreBebida = input.nextLine();
        System.out.print("Ingresa la temperatura: ");
        temperatura = input.nextDouble();

        if (temperatura > 60){
            System.out.println(nombreBebida + ":" +  " Caliente");
        } else if (temperatura >= 30 && temperatura <= 60){
            System.out.println(nombreBebida + ":" + " Templada");
        } else {
            System.out.println(nombreBebida + ":" + " Fria");
        }
    }
}

package ejercicios_practica;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int secreto = rand.nextInt(50) + 1;
        int intento = 0;

        while (intento != secreto) {
            System.out.print("Adivina el número (1-50): ");
            intento = scanner.nextInt();

            if (intento < secreto) {
                System.out.println("Muy bajo");
            } else if (intento > secreto) {
                System.out.println("Muy alto");
            }
        }
        scanner.close();

        System.out.println("¡Correcto! El número era " + secreto);
    }
}
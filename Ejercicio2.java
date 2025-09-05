package ejercicios_practica;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero de la tabla:");
        Integer numero = scanner.nextInt();

        for (int i =1; i<=10; i++){
            Integer resultado= numero*i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}

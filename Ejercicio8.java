package ejercicios_practica;


import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números de Fibonacci quieres ver? ");
        int n = scanner.nextInt();
        int a = 0, b = 1;

        System.out.println("Serie Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        scanner.close();
    }
}
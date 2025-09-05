package ejercicios_practica;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > mayor) mayor = numero;
            if (numero < menor) menor = numero;
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    
        scanner.close();
    }
    }

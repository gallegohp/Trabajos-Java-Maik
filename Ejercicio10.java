package ejercicios_practica;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000000;
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- Cajero Automático ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Saldo actual: $" + saldo);
            } else if (opcion == 2) {
                System.out.print("¿Cuánto deseas retirar? ");
                int retiro = scanner.nextInt();
                if (retiro <= saldo) {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                } else {
                    System.out.println("Fondos insuficientes.");
                }
            } else if (opcion == 3) {
                System.out.print("¿Cuánto deseas depositar? ");
                int deposito = scanner.nextInt();
                saldo += deposito;
                System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
            } else if (opcion == 4) {
                System.out.println("Gracias por usar el cajero.");
            } else {
                System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}
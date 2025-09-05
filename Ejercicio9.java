package ejercicios_practica;

import java.util.Scanner;

public class Ejercicio9 {
    private static final String CLAVE_CORRECTA = "sena2025";
    private static final int MAX_INTENTOS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < MAX_INTENTOS) {
            System.out.print("Ingresa la contraseña: ");
            String claveIngresada = scanner.nextLine();

            if (claveIngresada.equals(CLAVE_CORRECTA)) {
                accesoConcedido = true;
                break;
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (MAX_INTENTOS - intentos));
            }
        }

        if (accesoConcedido) {
            System.out.println("Acceso concedido. Bienvenido.");
        } else {
            System.out.println("Has superado el número máximo de intentos. Acceso denegado.");
        }
        scanner.close();
    }
}
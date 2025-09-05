package ejercicios_practica;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        int i = 1;
        while (i<=numero){
            if (i%2==0){
                System.out.println(i+" - Es Par");
            }else{
                System.out.println(i+" - Es Impar");
            }
            i++;
        }
        scanner.close();
    }
    
}

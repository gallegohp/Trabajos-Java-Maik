package ejercicios_practica;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        Integer numero = scanner.nextInt();
        Integer resultado=0;
        if (numero>0){
            for (int i = 1; i<=numero; i++){
                if (i%2==0){
                    resultado += i;
                }
            }
        }else{
            System.out.print("Numero invalido");
        }
        System.out.print("Resultado: " + resultado);
        scanner.close();
    }
}

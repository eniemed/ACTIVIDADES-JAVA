package pdf2;

import java.util.Scanner;

/*
 * 14 - Escribe un programa que diga cuál es la última cifra 
 * de un número entero introducido por teclado.
 */
public class Ejercicio14 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 && numero % 5 == 0) {
            System.out.println(numero + " es un número par y divisible entre 5.");
        } else if (numero % 2 == 0) {
            System.out.println(numero + " es un número par pero no es divisible entre 5.");
        } else if (numero % 5 == 0) {
            System.out.println(numero + " no es un número par pero es divisible entre 5.");
        } else {
            System.out.println(numero + " no es ni par ni divisible entre 5.");
        }

        scanner.close();
    }
}

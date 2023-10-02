package pdf2;

import java.util.Scanner;

/*
 * 17 - Escribe un programa que diga cuál es la última cifra de 
 * un número entero introducido por teclado.

 */
public class Ejercicio17 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Obtener la última cifra del número
        int ultimaCifra = numero % 10;

        System.out.println("La última cifra del número " + numero + " es: " + ultimaCifra);

        scanner.close();
    }
}

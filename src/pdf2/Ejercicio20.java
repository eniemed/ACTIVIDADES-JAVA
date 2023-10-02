package pdf2;

import java.util.Scanner;

/*
 * 20 - Realiza un programa que diga si un número entero 
 * positivo introducido por teclado es capicúa. Se permiten 
 * números de hasta 5 cifras.
 */
public class Ejercicio20 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo de hasta 5 cifras: ");
        int numero = scanner.nextInt();

        // Verifica si el número es capicúa
        if (esCapicua(numero)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        scanner.close();
    }

    // Función para verificar si un número es capicúa
    public static boolean esCapicua(int numero) {
        // Convierte el número a una cadena para facilitar la comparación
        String numeroStr = Integer.toString(numero);

        // Calcula la longitud de la cadena
        int longitud = numeroStr.length();

        // Compara los caracteres de izquierda a derecha con los de derecha a izquierda
        for (int i = 0; i < longitud / 2; i++) {
            if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
                return false; // No es capicúa
            }
        }

        return true; // Es capicúa
    }
}

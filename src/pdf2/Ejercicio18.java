package pdf2;

import java.util.Scanner;

/*
 * 18 - Escribe un programa que diga cuál es la primera cifra de un número entero 
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 */
public class Ejercicio18 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero de hasta 5 cifras: ");
        int numero = scanner.nextInt();

        // Obtener la primera cifra del número
        int primeraCifra = obtenerPrimeraCifra(numero);

        System.out.println("La primera cifra del número " + numero + " es: " + primeraCifra);

        scanner.close();
    }

    // Función para obtener la primera cifra de un número
    public static int obtenerPrimeraCifra(int numero) {
        // Mientras el número sea mayor que 9, sigue dividiéndolo por 10
        while (numero > 9) {
            numero /= 10;
        }
        return numero;
    }
}

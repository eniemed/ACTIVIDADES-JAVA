package pdf3;

import java.util.Scanner;

// 16 - Escribe un programa que diga si un número introducido por teclado es o no primo. Un número
// primo es aquel que sólo es divisible entre él mismo y la unidad.

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números negativos, 0 y 1 no son primos
        }
        
        // Verificar si el número es divisible por algún número desde 2 hasta la mitad de sí mismo
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false; // El número es divisible, por lo tanto no es primo
            }
        }
        
        return true; // Si no se encontraron divisores, el número es primo
    }
}

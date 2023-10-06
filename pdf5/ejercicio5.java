package pdf5;

import java.util.Arrays;
import java.util.Scanner;

/*
5 - Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente.
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicitar al usuario que ingrese 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe un número: ");
            numeros[i] = scanner.nextInt();
        }

        // Encontrar el valor máximo y mínimo
        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostrar los números con "máximo" y "mínimo"
        System.out.println("Números ingresados:");

        for (int numero : numeros) {
            System.out.print(numero);

            if (numero == maximo) {
                System.out.print(" (máximo)");
            } else if (numero == minimo) {
                System.out.print(" (mínimo)");
            }

            System.out.println();
        }
    }
}
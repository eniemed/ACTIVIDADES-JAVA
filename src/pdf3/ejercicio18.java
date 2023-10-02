package pdf3;

import java.util.Scanner;

/*
 * 18 - Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos, el programa debe empezar por el menor de los
enteros introducidos e ir incrementando de 7 en 7
 */


public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        // Pedir al usuario dos números distintos
        System.out.print("Ingrese el primer número entero: ");
        numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero (distinto al primero): ");
        numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números deben ser distintos. Intente de nuevo.");
        }

        scanner.close();

        // Encontrar el menor y el mayor de los números
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("Números enteros comprendidos entre " + menor + " y " + mayor + " de 7 en 7:");

        // Imprimir los números de 7 en 7
        for (int i = menor; i <= mayor; i += 7) {
            System.out.print(i + " ");
        }
    }
} 





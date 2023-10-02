package pdf3;

import java.util.Scanner;

/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares. El
número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye
en el cómputo.
 */
public class ejercicio21 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int cantidadNumeros = 0;
        int sumaImpares = 0;
        int cantidadImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        System.out.println("Introduzca números (introduzca un número negativo para finalizar):");

        do {
            numero = scanner.nextInt();

            if (numero >= 0) {
                cantidadNumeros++;

                if (numero % 2 != 0) { // Comprobar si el número es impar
                    sumaImpares += numero;
                    cantidadImpares++;
                } else if (numero > mayorPar) { // Comprobar si el número es par y mayor que el mayor encontrado hasta ahora
                    mayorPar = numero;
                }
            }

        } while (numero >= 0);

        scanner.close();

        if (cantidadNumeros > 0) {
            double mediaImpares = cantidadImpares > 0 ? (double) sumaImpares / cantidadImpares : 0.0;

            System.out.println("Cantidad de números introducidos: " + cantidadNumeros);
            System.out.println("Media de los números impares: " + mediaImpares);
            System.out.println("Mayor de los números pares: " + (mayorPar != Integer.MIN_VALUE ? mayorPar : "No se introdujeron números pares."));
        } else {
            System.out.println("No se introdujeron números.");
        }
    }
}

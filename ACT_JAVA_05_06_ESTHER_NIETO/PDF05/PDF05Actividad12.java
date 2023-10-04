package ACT_JAVA_05_06_ESTHER_NIETO.PDF05;

import java.util.Arrays;
import java.util.Scanner;

public class PDF05Actividad12 {
    public static void main(String[] args) {
        //Realiza un programa que pida 10 números por teclado y que los almacene en un array.
        // A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
        //Seguidamente el programa 2 pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar que inicial es
        //menor que final y que ambos números están entre 0 y 9. El programa deberá colocar el número de
        //la posición inicial en la posición final, rotando el resto de números para que no se pierda ninguno.
        //Al final se debe mostrar el array resultante.

        int[] numeros = new int[10];

        Scanner scanner = null; //esto lo ha hecho solo el intellij con un "quick fix"
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número:");
            scanner = new Scanner(System.in);
            numeros[i] = scanner.nextInt();
        }


        System.out.println("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        System.out.print("Introduce la posición inicial (0-9): ");
        int inicio = scanner.nextInt();

        System.out.print("Introduce la posición final (0-9): ");
        int fin = scanner.nextInt();

        if (inicio >= 0 && fin >= 0 && fin < 10 && inicio < fin) {
            int almacen = numeros[inicio];
            for (int i = inicio; i < fin; i++) {
                numeros[i] = numeros[i + 1];
            }
            numeros[fin] = almacen;

            System.out.println("Resultado: ");
            System.out.println(Arrays.toString(numeros));
        } else {
            System.out.println("Has insertado un número no válido como posición.");
        }
    }
}

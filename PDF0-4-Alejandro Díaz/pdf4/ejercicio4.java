package pdf4;

import java.util.Random;

/*
 * 4 - Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) sepa- rados por espacios
 */
public class ejercicio4 {
     public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random rand = new Random();

        // Generar y mostrar 20 números aleatorios entre 0 y 10
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = rand.nextInt(11); // Números entre 0 y 10
            System.out.print(numeroAleatorio + " ");
        }

        // Agregar un salto de línea al final
        System.out.println();
    }
}

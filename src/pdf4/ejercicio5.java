package pdf4;

import java.util.Random;

/*
 * 5 - Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
Muestra también el máximo, el mínimo y la media de esos números.
 */
public class ejercicio5 {
     public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random rand = new Random();

        int cantidadNumeros = 50;
        int minimo = 100;
        int maximo = 199;
        int suma = 0;
        int numeroMaximo = Integer.MIN_VALUE;
        int numeroMinimo = Integer.MAX_VALUE;

        // Generar y mostrar 50 números aleatorios entre 100 y 199
        System.out.print("Números aleatorios: ");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = rand.nextInt(maximo - minimo + 1) + minimo;
            System.out.print(numeroAleatorio + " ");
            
            // Actualizar máximo y mínimo
            numeroMaximo = Math.max(numeroMaximo, numeroAleatorio);
            numeroMinimo = Math.min(numeroMinimo, numeroAleatorio);

            // Sumar para calcular la media
            suma += numeroAleatorio;
        }

        // Calcular la media
        double media = (double) suma / cantidadNumeros;

        // Mostrar resultados
        System.out.println();
        System.out.println("Máximo: " + numeroMaximo);
        System.out.println("Mínimo: " + numeroMinimo);
        System.out.println("Media: " + media);
    }
}

package pdf4;

import java.util.Random;

/*
 * 8 - Modifica el programa anterior para que la probabilidad de 
 * que salga un 1 sea de 1/2, la probabilidad de que salga x sea de 1/3 y la 
 * probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3
= 2/6.

 */
public class ejercicio8 {
     public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random rand = new Random();

        int numeroApuestas = 3;
        int partidos = 14;

        System.out.println("Quiniela con Probabilidades:");
        
        // Generar y mostrar las apuestas
        for (int apuesta = 1; apuesta <= numeroApuestas; apuesta++) {
            System.out.println("Apuesta #" + apuesta + ":");
            for (int partido = 1; partido <= partidos; partido++) {
                char resultado = generarResultado(rand);
                System.out.print(resultado + " ");
            }
            char pleno15 = generarResultado(rand);
            System.out.print("Pleno al Quince: " + pleno15);
            System.out.println("\n");
        }
    }

    // Función para generar un resultado aleatorio con probabilidades ajustadas
    public static char generarResultado(Random rand) {
        double numeroAleatorio = rand.nextDouble(); // Generar un número decimal aleatorio entre 0 y 1
        
        if (numeroAleatorio < 3.0 / 6.0) {
            return '1';
        } else if (numeroAleatorio < 5.0 / 6.0) {
            return 'X';
        } else {
            return '2';
        }
    }
}

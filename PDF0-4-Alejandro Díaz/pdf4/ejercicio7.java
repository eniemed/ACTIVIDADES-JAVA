package pdf4;

import java.util.Random;

/*
 * 7 - Escribe un programa que muestre tres apuestas de la quiniela en tres 
 * colum- nas para los 14 partidos y el pleno al quince (15 filas). 58Números aleatorios
 */
public class ejercicio7 {
     public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random rand = new Random();

        int numeroApuestas = 3;
        int partidos = 14;

        System.out.println("Quiniela Aleatoria:");
        
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

    // Función para generar un resultado aleatorio (1, X, 2)
    public static char generarResultado(Random rand) {
        int numeroAleatorio = rand.nextInt(3);
        char resultado;
        switch (numeroAleatorio) {
            case 0:
                resultado = '1';
                break;
            case 1:
                resultado = 'X';
                break;
            default:
                resultado = '2';
                break;
        }
        return resultado;
    }
}

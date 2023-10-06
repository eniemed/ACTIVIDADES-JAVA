package pdf51;

import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int tamanoTablero = 5; // Tamaño del tablero (5x5)
        int[][] tablero = new int[tamanoTablero][tamanoTablero];

        // Colocar el tesoro en una posición aleatoria
        int tesoroFila = rand.nextInt(tamanoTablero);
        int tesoroColumna = rand.nextInt(tamanoTablero);
        tablero[tesoroFila][tesoroColumna] = 1; // 1 representa el tesoro

        // Colocar las minas en posiciones aleatorias
        int numMinas = 3; // Número de minas
        for (int i = 0; i < numMinas; i++) {
            int minaFila, minaColumna;
            do {
                minaFila = rand.nextInt(tamanoTablero);
                minaColumna = rand.nextInt(tamanoTablero);
            } while (tablero[minaFila][minaColumna] != 0); // Asegurarse de que no haya una mina ya en esa posición
            tablero[minaFila][minaColumna] = -1; // -1 representa una mina
        }

        // Mostrar el tablero vacío
        System.out.println("¡Bienvenido a Busca el Tesoro!");
        mostrarTableroVacio(tamanoTablero);

        int intentos = 0;
        boolean encontrado = false;

        while (!encontrado) {
            System.out.print("Introduce la fila: ");
            int fila = scanner.nextInt();
            System.out.print("Introduce la columna: ");
            int columna = scanner.nextInt();

            if (fila < 0 || fila >= tamanoTablero || columna < 0 || columna >= tamanoTablero) {
                System.out.println("Movimiento fuera del tablero. Inténtalo de nuevo.");
                continue;
            }

            intentos++;

            if (tablero[fila][columna] == 1) {
                System.out.println("¡Encontraste el tesoro en " + intentos + " intentos!");
                encontrado = true;
            } else if (tablero[fila][columna] == -1) {
                System.out.println("¡Cuidado! ¡Hay una mina cerca!");
            } else {
                System.out.println("No encontraste nada. Sigue buscando.");
            }
        }
    }

    // Función para mostrar el tablero vacío
    public static void mostrarTableroVacio(int tamano) {
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}

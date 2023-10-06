package pdf51;

import java.util.Random;

public class ejercicio9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int tamano = 12; // Tamaño de la matriz (12x12)

        // Crear y llenar la matriz original con números aleatorios entre 0 y 100
        int[][] matrizOriginal = new int[tamano][tamano];
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                matrizOriginal[fila][columna] = rand.nextInt(101); // Números aleatorios entre 0 y 100
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz Original:");
        mostrarMatriz(matrizOriginal);

        // Rotar la matriz en el sentido de las agujas del reloj
        int[][] matrizRotada = rotarMatriz(matrizOriginal);

        // Mostrar la matriz resultado
        System.out.println("\nMatriz Rotada:");
        mostrarMatriz(matrizRotada);
    }

    // Función para rotar una matriz cuadrada en el sentido de las agujas del reloj
    public static int[][] rotarMatriz(int[][] matriz) {
        int tamano = matriz.length;
        int[][] matrizRotada = new int[tamano][tamano];

        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                matrizRotada[columna][tamano - 1 - fila] = matriz[fila][columna];
            }
        }

        return matrizRotada;
    }

    // Función para mostrar una matriz con alineación adecuada
    public static void mostrarMatriz(int[][] matriz) {
        int tamano = matriz.length;

        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                System.out.printf("%3d ", matriz[fila][columna]);
            }
            System.out.println();
        }
    }
}

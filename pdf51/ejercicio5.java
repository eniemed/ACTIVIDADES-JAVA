package pdf51;

import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matriz = new int[6][10];

        // Rellenar la matriz con números aleatorios entre 0 y 1000
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                matriz[fila][columna] = rand.nextInt(1001); // Números aleatorios entre 0 y 1000
            }
        }

        // Encontrar la posición del valor máximo y mínimo
        int maximo = matriz[0][0];
        int minimo = matriz[0][0];
        int filaMax = 0;
        int columnaMax = 0;
        int filaMin = 0;
        int columnaMin = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                if (matriz[fila][columna] > maximo) {
                    maximo = matriz[fila][columna];
                    filaMax = fila;
                    columnaMax = columna;
                } else if (matriz[fila][columna] < minimo) {
                    minimo = matriz[fila][columna];
                    filaMin = fila;
                    columnaMin = columna;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        // Mostrar la posición del valor máximo y mínimo
        System.out.println("Posición del valor máximo: Fila " + filaMax + ", Columna " + columnaMax);
        System.out.println("Posición del valor mínimo: Fila " + filaMin + ", Columna " + columnaMin);
    }
}

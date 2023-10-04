package ACT_JAVA_05_06_ESTHER_NIETO.PDF051;

import java.util.Scanner;

public class PDF051Actividad2 {
    public static void main(String[] args) {
        //Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array
        //de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que
        //si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
        Scanner scanner = new Scanner(System.in);

        int[][] numeros = new int[4][5];

        System.out.println("Introduce 20 números:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                numeros[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += numeros[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }

        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
        }

        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += numeros[i][j];
            }
        }

        System.out.println("Suma total: " + sumaTotal);
    }
}

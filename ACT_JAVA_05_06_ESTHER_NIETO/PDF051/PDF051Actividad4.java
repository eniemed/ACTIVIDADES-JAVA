import java.util.Random;
import java.util.Scanner;

public class PDF051Actividad4 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int[][] numeros = new int[4][5];

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = random.nextInt(900) + 100;  // genera número aleatorio entre 100 y 999
            }
        }

        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += numeros[i][j];
            }
            Thread.sleep(1000); //1000 millis es 1 segundo (creo) 2 ya era muy largo
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }

        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            Thread.sleep(1000);
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
        }

        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += numeros[i][j];
            }
        }
        Thread.sleep(1000);
        System.out.println("Suma total: " + sumaTotal);
    }
}

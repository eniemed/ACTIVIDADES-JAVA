package ACT_JAVA_05_06_ESTHER_NIETO.PDF05;

import java.util.Scanner;

public class PDF05Actividad6 {
    public static void main(String[] args) {

        int[] arrayNumeros = new int[15];

        for (int i = 0; i < arrayNumeros.length; i++) {

            System.out.println("Introduce un número: ");
            Scanner numeros = new Scanner(System.in);
            arrayNumeros[i] = numeros.nextInt();

        }
        int ultimoNumero = arrayNumeros[arrayNumeros.length - 1];

        for (int i = arrayNumeros.length - 1; i > 0; i--) {
            arrayNumeros[i] = arrayNumeros[i - 1];
        }
        arrayNumeros[0] = ultimoNumero;

        for (int arrayNumero : arrayNumeros) {
            System.out.println(arrayNumero);
        }
    }
}

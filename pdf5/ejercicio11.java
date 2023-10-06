package pdf5;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicitar al usuario que ingrese 10 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el contenido del array junto con el índice
        System.out.println("Contenido del array con índices:");
        System.out.println("Índice\tValor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }

        // Mover números primos a las primeras posiciones
        int[] resultado = new int[numeros.length];
        int primerPosicion = 0;

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                resultado[primerPosicion] = numero;
                primerPosicion++;
            }
        }

        for (int numero : numeros) {
            if (!esPrimo(numero)) {
                resultado[primerPosicion] = numero;
                primerPosicion++;
            }
        }

        // Mostrar el array resultante
        System.out.println("Array resultante:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(i + "\t" + resultado[i]);
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

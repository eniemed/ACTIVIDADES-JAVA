package pdf5;
import java.util.Random;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int[] numeros = new int[100];

        // Llenar el array con números aleatorios entre 0 y 500
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(501); // Números aleatorios entre 0 y 500
        }

        // Mostrar el array original
        System.out.println("Array original:");
        mostrarArray(numeros);

        // Preguntar al usuario si quiere destacar el máximo o el mínimo
        System.out.print("¿Deseas destacar el máximo o el mínimo? (max/min): ");
        String opcion = scanner.nextLine();

        // Encontrar y destacar el máximo o el mínimo
        if (opcion.equalsIgnoreCase("max")) {
            int maximo = encontrarMaximo(numeros);
            destacarNumero(numeros, maximo);
        } else if (opcion.equalsIgnoreCase("min")) {
            int minimo = encontrarMinimo(numeros);
            destacarNumero(numeros, minimo);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Función para mostrar un array
    public static void mostrarArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    // Función para encontrar el valor máximo en un array
    public static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int numero : array) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }

    // Función para encontrar el valor mínimo en un array
    public static int encontrarMinimo(int[] array) {
        int minimo = array[0];
        for (int numero : array) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }

    // Función para destacar un número en un array con asteriscos
    public static void destacarNumero(int[] array, int numero) {
        System.out.println("Array con número destacado:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                System.out.print("**" + numero + "** ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}


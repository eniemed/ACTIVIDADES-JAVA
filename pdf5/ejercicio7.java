package pdf5;
import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Generar 100 números aleatorios entre 0 y 20
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(21); // Números aleatorios entre 0 y 20
        }

        // Mostrar los números aleatorios
        System.out.println("Números aleatorios generados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Pedir al usuario los valores a cambiar
        System.out.print("Ingresa el primer valor a cambiar: ");
        int valorAntiguo = scanner.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        int valorNuevo = scanner.nextInt();

        // Cambiar las ocurrencias del primer valor por el segundo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorAntiguo) {
                numeros[i] = valorNuevo;
            }
        }

        // Mostrar la lista actualizada con valores entrecomillados si se cambiaron
        System.out.println("Lista actualizada:");
        for (int numero : numeros) {
            if (numero == valorNuevo) {
                System.out.print("\"" + numero + "\" ");
            } else {
                System.out.print(numero + " ");
            }
        }
    }
}

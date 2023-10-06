package pdf5;

import java.util.Random;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int[] mesas = new int[10]; // 10 mesas en el restaurante

        // Inicializar las mesas con valores aleatorios entre 0 y 4 (0 = mesa vacía, 1-4 = comensales)
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = rand.nextInt(5); // Números aleatorios entre 0 y 4
        }

        while (true) {
            // Mostrar el estado actual de las mesas
            System.out.println("Estado de las mesas:");
            for (int i = 0; i < mesas.length; i++) {
                System.out.println("Mesa " + (i + 1) + ": " + mesas[i] + " comensales");
            }

            // Preguntar cuántos clientes llegan
            System.out.print("¿Cuántos clientes llegan? (0 para salir): ");
            int numClientes = scanner.nextInt();

            if (numClientes == 0) {
                System.out.println("Gracias por visitar el restaurante. ¡Hasta luego!");
                break;
            }

            if (numClientes > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + numClientes +
                        " personas. Haga grupos de 4 personas como máximo e intente de nuevo.");
                continue;
            }

            // Buscar una mesa para el grupo
            boolean mesaEncontrada = false;

            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] == 0 || (mesas[i] + numClientes) <= 4) {
                    mesas[i] += numClientes;
                    mesaEncontrada = true;
                    break;
                }
            }

            if (!mesaEncontrada) {
                System.out.println("No hay mesas disponibles para el grupo de " + numClientes + " personas.");
            }
        }
    }
}

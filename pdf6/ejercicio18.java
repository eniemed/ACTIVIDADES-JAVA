package pdf6;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String binario = decimalABinario(numeroDecimal);

        System.out.println("El número binario equivalente es: " + binario);
    }

    // Función para convertir un número decimal a binario
    public static String decimalABinario(int decimal) {
        if (decimal == 0) {
            return "0"; // Caso especial: el decimal 0 es igual a "0" en binario
        }

        StringBuilder binario = new StringBuilder();

        while (decimal > 0) {
            int residuo = decimal % 2; // Calcula el residuo al dividir por 2
            binario.insert(0, residuo); // Inserta el residuo al principio de la cadena
            decimal /= 2; // Divide el decimal por 2
        }

        return binario.toString();
    }
}

package pdf2;

import java.util.Scanner;

/*
 * 19 - Realiza un programa que nos diga cuántos dígitos 
 * tiene un número entero que puede ser positivo o negativo. 
 * Se permiten números de hasta 5 dígitos
 */
public class Ejercicio19 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero de hasta 5 dígitos: ");
        int numero = scanner.nextInt();

        // Calcula el número de dígitos usando la función Math.abs() para asegurarse de que sea positivo
        int cantidadDigitos = contarDigitos(Math.abs(numero));

        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");

        scanner.close();
    }

    // Función para contar la cantidad de dígitos en un número
    public static int contarDigitos(int numero) {
        // Inicializa el contador de dígitos
        int contador = 0;

        // Itera mientras el número no sea cero
        while (numero != 0) {
            // Divide el número por 10 para eliminar un dígito
            numero /= 10;
            // Incrementa el contador
            contador++;
        }

        // Retorna la cantidad de dígitos
        return contador;
    }
}

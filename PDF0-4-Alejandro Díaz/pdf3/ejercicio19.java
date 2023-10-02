package pdf3;

import java.util.Scanner;

// 19 - Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El
// carácter con el que se pinta la pirámide también se debe pedir por teclado.

public class ejercicio19 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();

        System.out.print("Ingrese el carácter con el que desea dibujar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        scanner.close();

        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco a la izquierda
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir el carácter
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(caracter);
            }

            // Cambiar de línea
            System.out.println();
        }
    }
}

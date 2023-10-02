package pdf3;

import java.util.Scanner;

/*
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

 */
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la pirámide hueca: ");
        int altura = scanner.nextInt();

        System.out.print("Ingrese el carácter con el que desea dibujar la pirámide hueca: ");
        char caracter = scanner.next().charAt(0);

        scanner.close();

        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco a la izquierda
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir el carácter o espacios en blanco en el medio
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == altura) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }

            // Cambiar de línea
            System.out.println();
        }
    }
}

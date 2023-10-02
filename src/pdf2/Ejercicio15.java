package pdf2;

import java.util.Scanner;
/*
 * 15 - Escribe un programa que pinte una pirámide rellena con 
 * un carácter introdu- cido por teclado que
podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc.
 El programa debe permitir
al usuario mediante un menú elegir si el vértice de la pirámide 
está apuntando hacia arriba, hacia
abajo, hacia la izquierda o hacia la derecha
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para pintar una pirámide rellena.");
        System.out.print("Introduce el carácter para rellenar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        System.out.println("Elige la dirección de la pirámide:");
        System.out.println("1. Vértice hacia arriba");
        System.out.println("2. Vértice hacia abajo");
        System.out.println("3. Vértice hacia la izquierda");
        System.out.println("4. Vértice hacia la derecha");
        System.out.print("Selecciona una opción (1/2/3/4): ");
        int opcion = scanner.nextInt();

        int altura = 5; // Altura fija en 5

        switch (opcion) {
            case 1:
                piramideArriba(caracter, altura);
                break;
            case 2:
                piramideAbajo(caracter, altura);
                break;
            case 3:
                piramideIzquierda(caracter, altura);
                break;
            case 4:
                piramideDerecha(caracter, altura);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }

    // Función para pintar una pirámide con vértice hacia arriba
    public static void piramideArriba(char caracter, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    // Función para pintar una pirámide con vértice hacia abajo
    public static void piramideAbajo(char caracter, int altura) {
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    // Función para pintar una pirámide con vértice hacia la izquierda
    public static void piramideIzquierda(char caracter, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    // Función para pintar una pirámide con vértice hacia la derecha
    public static void piramideDerecha(char caracter, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = altura; k >= i; k--) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}


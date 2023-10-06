package pdf5;


import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[8];

        // Solicitar al usuario que ingrese 8 números enteros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números junto con "par" o "impar"
        System.out.println("Números ingresados con etiqueta:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
            } else {
                System.out.println(numero + " es impar");
            }
        }
    }
}

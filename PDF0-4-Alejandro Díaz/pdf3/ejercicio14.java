package pdf3;

import java.util.Scanner;

public class ejercicio14 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        scanner.close();

        if (exponente < 0) {
            System.out.println("El exponente debe ser un entero positivo.");
        } else {
            double resultado = Math.pow(base, exponente);
            System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
        }
    }
}

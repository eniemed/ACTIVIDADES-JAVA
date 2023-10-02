package pdf1;

import java.util.Scanner;

/*
 6 - Escribe un programa que calcule el área de un triángulo.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del triángulo : ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del triángulo : ");
        double altura = scanner.nextDouble();


        // Calcular el área del triángulo 

        double area = (0.5)*base*altura;

        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }
}

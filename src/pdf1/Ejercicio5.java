package pdf1;

import java.util.Scanner;

/*
 5 - Escribe un programa que calcule el área de un rectángulo.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingresa la anchura del rectángulo: ");
        double anchura = scanner.nextDouble();

        // Calcula el área del rectángulo
        double area = longitud * anchura;

        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }

}

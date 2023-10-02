package pdf1;

import java.util.Scanner;

public class Ejercicio9 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del cono: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingresa la altura del cono: ");
        double altura = scanner.nextDouble();

        // Calcular el volumen del cono (V = (1/3) * π * r^2 * h)
        double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volumen del cono es: " + volumen);

        scanner.close();
    }
}

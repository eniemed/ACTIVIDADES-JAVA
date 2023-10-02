package pdf1;

import java.util.Scanner;

/*
 7 - Escribe un programa que calcule el total de una 
 factura a partir de la base imponible.
 */
public class Ejercicio7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base imponible de la factura: ");
        double baseImponible = scanner.nextDouble();

        // Definir el porcentaje del IVA
        double porcentajeIVA = 0.16;

        // Calcular el impuesto (IVA)
        double impuestoIVA = baseImponible * porcentajeIVA;

        // Calcular el total de la factura (base imponible + impuesto)
        double totalFactura = baseImponible + impuestoIVA;

        System.out.println("Base Imponible: $" + baseImponible);
        System.out.println("Impuesto (IVA): $" + impuestoIVA);
        System.out.println("Total de la factura: $" + totalFactura);

        scanner.close();
    }
}

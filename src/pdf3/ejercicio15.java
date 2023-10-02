package pdf3;

import java.util.Scanner;

// 15 - Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
// saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos
// el 2 y el 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .46 Bucles


public class ejercicio15 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base (número real): ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        scanner.close();

        if (exponente < 1) {
            System.out.println("El exponente debe ser un entero positivo.");
        } else {
            System.out.println("Potencias de " + base + " desde 1 hasta " + exponente + ":");

            for (int i = 1; i <= exponente; i++) {
                double resultado = calcularPotencia(base, i);
                System.out.println(base + " ^ " + i + " = " + resultado);
            }
        }
    }

    // Método para calcular la potencia sin utilizar Math.pow
    public static double calcularPotencia(double base, int exponente) {
        double resultado = 1.0;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}

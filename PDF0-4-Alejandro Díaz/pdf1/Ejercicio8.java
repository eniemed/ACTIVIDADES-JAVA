package pdf1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de horas trabajadas a la semana: ");
        double horasTrabajadas = scanner.nextDouble();

        // Tasa de pago por hora
        double tasaPagoPorHora = 12.0; // 12 euros por hora

        // Calcular el salario semanal (horas trabajadas * tasa de pago por hora)
        double salarioSemanal = horasTrabajadas * tasaPagoPorHora;

        System.out.println("Salario semanal: " + salarioSemanal + " euros");

        scanner.close();
    }
}

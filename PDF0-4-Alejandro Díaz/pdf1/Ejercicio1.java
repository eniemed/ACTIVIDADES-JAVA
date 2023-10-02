package pdf1;
import java.util.Scanner;
/*
1 - Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        scanner.close();

        double multiplicacion = numero1 * numero2;

        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es igual a " + multiplicacion);
    }
}

import java.util.Scanner;

public class PDF02Actividad5 {
    public static void main(String[] args) {
        /*
        Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
        ax = -b
        x = -b/a
         */
        double resultado;

        System.out.print("Introduzca el valor de a: ");
        Scanner valorA = new Scanner(System.in);
        double a = valorA.nextDouble();

        System.out.print("Introduzca el valor de b: ");
        Scanner valorB = new Scanner(System.in);
        double b = valorB.nextDouble();

        resultado = - b / a;

        System.out.println("El valor de la x es " + resultado);

    }
}

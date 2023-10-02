package Actividad_Aleatorio_reloj.PDF02;

import java.util.Scanner;

public class PDF02Actividad9 {
    public static void main(String[] args) {
        //Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax 2 + bx + c = 0).
        //-b +- ¬b^2 - 4ac/2a
        System.out.println("Introduzca los valores: ");

        Scanner A = new Scanner(System.in);
        System.out.println("a: ");
        double a = A.nextDouble();

        Scanner B = new Scanner(System.in);
        System.out.println("b: ");
        double b = B.nextDouble();

        Scanner C = new Scanner(System.in);
        System.out.println("c: ");
        double c = C.nextDouble();

        double operacion1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/2 * a;
        double operacion2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/2 * a;

        String cadena1 = String.valueOf(operacion1);
        String cadena2 = String.valueOf(operacion2);

        if (cadena1.equals("NaN") && cadena2.equals("NaN")) {
            System.out.println("No existen soluciones reales para la ecuación planteada.");
        } else if (cadena1.equals("NaN") && !cadena2.equals("NaN")) {
            System.out.println("La solución de la ecuación es " + cadena2);
        } else if (!cadena1.equals("NaN") && cadena2.equals("NaN")) {
            System.out.println("La solución de la ecuación es " + cadena1);
        } else {
            System.out.println("Las solución de la ecuación son " + cadena1 + " y " + cadena2);
        }
    }
}

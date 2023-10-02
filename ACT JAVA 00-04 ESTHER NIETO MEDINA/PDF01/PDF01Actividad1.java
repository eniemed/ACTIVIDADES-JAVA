package Actividad_Aleatorio_reloj.PDF01;

import java.util.Scanner;

public class PDF01Actividad1 {
    public static void main(String[] args) {
        System.out.println("Introduce dos números: ");
        Scanner numero1 = new Scanner(System.in);

        Scanner numero2 = new Scanner(System.in);

        double resultado = numero1.nextDouble() * numero2.nextDouble();
        System.out.println("El resultado de la multiplicación de ambos números es " + resultado);

    }
}

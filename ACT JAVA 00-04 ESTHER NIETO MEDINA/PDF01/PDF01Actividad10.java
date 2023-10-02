package Actividad_Aleatorio_reloj.PDF01;

import java.util.Scanner;

public class PDF01Actividad10 {
    public static void main(String[] args) {
        // 1 mb = 1000 kb

        System.out.println("Introduce una cantidad de Mb: ");
        Scanner mb_recibidos = new Scanner(System.in);

        double resultado = mb_recibidos.nextDouble() * 1000;

        System.out.println(resultado + " kb");

    }
}

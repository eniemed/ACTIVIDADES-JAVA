package Actividad_Aleatorio_reloj.PDF01;

import java.util.Scanner;

public class PDF01Actividad11 {
    public static void main(String[] args) {

        System.out.println("Introduce una cantidad de Kb: ");
        Scanner kb_recibidos = new Scanner(System.in);

        double resultado = kb_recibidos.nextDouble() / 1000;

        System.out.println(resultado + " Mb");

    }
}

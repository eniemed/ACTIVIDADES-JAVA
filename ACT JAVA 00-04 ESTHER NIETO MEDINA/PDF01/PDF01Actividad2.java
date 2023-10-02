package Actividad_Aleatorio_reloj.PDF01;

import java.util.Scanner;

public class PDF01Actividad2 {
    public static void main(String[] args) {
        System.out.println("Introduce una cantidad de euros: ");
        Scanner euros = new Scanner(System.in);

        double dinero = euros.nextDouble();

        double resultado = dinero * 166.3860;
        System.out.print(resultado + " pesetas.");
    }
}

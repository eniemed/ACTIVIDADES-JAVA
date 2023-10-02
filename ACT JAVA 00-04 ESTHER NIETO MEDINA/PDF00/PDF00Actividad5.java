package Actividad_Aleatorio_reloj.PDF00;

import java.util.Scanner;

public class PDF00Actividad5 {
    public static void main(String[] args) {
        // 1 peseta = 0.00601012 euros (double)

        double pesetas = 2500;

        double resultado = pesetas * 0.00601012;
        System.out.print(pesetas + " pesetas son " + resultado + " euros.");
    }
}

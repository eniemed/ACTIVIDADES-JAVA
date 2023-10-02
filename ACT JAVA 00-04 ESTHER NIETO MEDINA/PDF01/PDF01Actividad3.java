package Actividad_Aleatorio_reloj.PDF01;

import java.util.Scanner;

public class PDF01Actividad3 {
    public static void main(String[] args) {

        System.out.println("Introduce una cantidad de pesetas: ");
        Scanner pesetas = new Scanner(System.in);

        double dinero = pesetas.nextDouble();

        double resultado = dinero * 0.00601012;
            System.out.print(resultado + " euros.");
    }
}

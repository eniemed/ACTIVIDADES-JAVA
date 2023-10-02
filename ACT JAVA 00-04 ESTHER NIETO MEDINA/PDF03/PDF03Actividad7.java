package Actividad_Aleatorio_reloj.PDF03;

import java.util.Scanner;

public class PDF03Actividad7 {
    public static void main(String[] args) {
        int contador = 0;
        int contraseña = 4526;
        while (contador != 4) {
            System.out.println("Introduce la contraseña de 4 dígitos: ");
            Scanner contraseña_pedida = new Scanner(System.in);
            int contra_pedida = contraseña_pedida.nextInt();

            if (contra_pedida == contraseña) {
                System.out.println("Correcto. Caja fuerte abierta");
                break;
            } else {
                System.out.println("Error");
                contador++;
                continue;
            }
        }
    }
}

package Actividad_Aleatorio_reloj.PDF04;

import java.util.Scanner;

public class PDF04Actividad14 {
    public static void main(String[] args) {

        //Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará
        //adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que estás pensando es
        //mayor o menor que el que te acaba de decir.
        int contador = 0;
        System.out.println("¡Piensa en un número el 1 al 10!");
        System.out.println("¿Listo?");
        while (contador < 5) {
            int numero = (int) Math.round(Math.random() * 10);
            System.out.println("¿Es tu número el " + numero + "?");
            Scanner si_no = new Scanner(System.in);
            var sino = si_no.next();

            if (sino.equals("no")) {
                contador++;
            } else {
                System.out.println("¡Genial, gracias por jugar!");
                break;
            }
        }
    }
}

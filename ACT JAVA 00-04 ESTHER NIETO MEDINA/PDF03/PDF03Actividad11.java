package Actividad_Aleatorio_reloj.PDF03;

import java.util.Scanner;

public class PDF03Actividad11 {
    public static void main(String[] args) {
        //Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
        //números enteros a partir de uno que se introduce por teclado.

        System.out.println("Introduce un número: ");
        Scanner numero1 = new Scanner(System.in);
        int numero_recibido = numero1.nextInt();

        int contador = 1;
        int cubo = 0;
        int cuadrado = 0;

        while (contador <= 5) {

            cuadrado = (int) Math.pow(numero_recibido, 2);
            cubo = (int) Math.pow(numero_recibido, 3);
            System.out.println(numero_recibido + " - - - " + cuadrado + " - - - " + cubo);
            numero_recibido ++;
            contador++;
        }
    }
}

package Actividad_Aleatorio_reloj.PDF03;

import java.util.Scanner;

public class PDF03Actividad9 {
    //Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner numero1 = new Scanner(System.in);
        String numero = numero1.next();

        int cadena = numero.length();
        System.out.println("El número " + numero + " tiene " + cadena + " dígitos");
    }
}

package Actividad_Aleatorio_reloj.PDF03;

import java.util.Scanner;

public class PDF03Actividad8 {
    //Muestra la tabla de multiplicar de un número introducido por teclado
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner numero1 = new Scanner(System.in);
        int numero = numero1.nextInt();

        int contador = 1;
        int resultado = numero;

        while (contador <= 9) {
            System.out.println(numero + " * " + contador + " = " + resultado);
            contador++;
            resultado = numero * contador;
        }
    }
}

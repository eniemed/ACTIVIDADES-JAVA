package Actividad_Aleatorio_reloj.PDF03;

import java.util.Scanner;

public class PDF03Actividad10 {
    //Escribe un programa que calcule la media de un conjunto de números positivos introducidos por
    //teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que
    //ha terminado de introducir los datos cuando meta un número negativo
    public static void main(String[] args) {

        double contador = 0;
        double almacen = 0;

        while(true) {

            System.out.println("Introduce un número: ");
            Scanner numero1 = new Scanner(System.in);
            int numero_recibido = numero1.nextInt();

            if (numero_recibido < 0) {
                break;
            } else {
                almacen += numero_recibido;
                contador ++;
            }
        }
        double solucion = almacen / contador;
        System.out.println("La solución es " + solucion);
        System.out.println(almacen);
        System.out.println(contador);
    }
}

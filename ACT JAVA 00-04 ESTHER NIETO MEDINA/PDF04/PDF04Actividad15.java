package Actividad_Aleatorio_reloj.PDF04;

import java.util.ArrayList;
import java.util.List;

public class PDF04Actividad15 {
    public static void main(String[] args) {
        /*
        Realiza un generador de melodía con las siguientes condiciones:
        1. Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
        sol, la y si.
        1. Una melodía está formada por un número aleatorio de notas mayor o igual
        a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
        1. Cada grupo de 4 notas será un compás y estará separado del siguiente
        compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
        2
        1. La última nota de la melodía debe coincidir con la primera.
        Ejemplo 1:
        do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
        Ejemplo 2:
        la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
         */

        List<String> notas_recibidas = new ArrayList<String>(); //lista que almacena las notas que van saliendo
        String[] array_notas = {"do", "re", "mi", "fa", "sol", "la", "si"}; //array con las notas existentes para acceder fácilmente a ellas
        int[] cantidad_notas = {3, 7, 11, 15, 19, 23, 27}; //cantidades de mnotas por compás - 1 para añadirle al final la primera y que resulten 3 + 1 al final

        int contador = 0; //contador que se encarga del compás

        String primeraNota = " "; //variable que guarda la primera nota para poder añadirla al final




        int cantidad = (int) Math.round(Math.random() * 6); //crea la posicion para decidir la cantidad de notas

        for (int i = 0; i <= cantidad_notas[cantidad]; i++) {
            int numero = (int) Math.round(Math.random() * 6); //crea la posición para sacar las notas existentes
            notas_recibidas.add(array_notas[numero]);
        }

        for (int i = 0; i <= cantidad_notas[cantidad]; i++) {
            System.out.print(notas_recibidas.get(i) + " ");
            contador++;
            primeraNota = notas_recibidas.get(0);
            if (contador == 4) {
                System.out.print("| ");
                contador = 0;
            }
            if (i == cantidad) {
                System.out.println(primeraNota + " ||");
                break;
            }
        }




    }
}

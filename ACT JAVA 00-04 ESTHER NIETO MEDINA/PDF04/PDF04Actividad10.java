package Actividad_Aleatorio_reloj.PDF04;

import java.util.Random;

public class PDF04Actividad10 {

    //Realiza un programa que pinte por pantalla diez líneas formadas por carac- teres. El carácter con
    //el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las
    //líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

    public static void main(String[] args) {
        String[] caracteres = {"*", "-", "=", ".", "|", "@"};

        int contador = 0;

        while (contador <= 10){
            int numRandom = (int) (Math.random() * 6);
            int numRandom2 = (int) (Math.random() * 40 + 1);
            for (int i = 0; i <= numRandom2; i++) {
                System.out.print(caracteres[numRandom]);
            }
            contador++;
        }
    }
}


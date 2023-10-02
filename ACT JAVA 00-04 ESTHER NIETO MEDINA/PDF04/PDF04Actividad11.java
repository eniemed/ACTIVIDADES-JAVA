package Actividad_Aleatorio_reloj.PDF04;

import java.util.Random;

public class PDF04Actividad11 {
    public static void main(String[] args) {
        //Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
        //forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.

        int contador_suspensos = 0;
        int contador_suficientes = 0;
        int contador_bien = 0;
        int contador_notable = 0;
        int contador_sobresaliente = 0;

        for (int i = 0; i <= 20; i++) {

            var numeroRandom = Math.random() * 10;
            System.out.println(numeroRandom);

            if (numeroRandom < 5) {
                contador_suspensos++;
            } else if (numeroRandom < 6) {
                contador_suficientes++;
            } else if (numeroRandom < 8) {
                contador_bien++;
            } else if (numeroRandom < 9) {
                contador_notable++;
            } else {
                contador_sobresaliente++;
            }


        }

        System.out.println("Suspensos: " + contador_suspensos);
        System.out.println("Suficientes: " + contador_suficientes);
        System.out.println("Bienes: " + contador_bien);
        System.out.println("Notables: " + contador_notable);
        System.out.println("Sobresalientes: " + contador_sobresaliente);

    }
}

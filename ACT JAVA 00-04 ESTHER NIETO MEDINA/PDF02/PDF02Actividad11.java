package Actividad_Aleatorio_reloj.PDF02;

import java.util.Random;
import java.util.Scanner;

public class PDF02Actividad11 {
    public static void main(String[] args) {

        System.out.print("Introduce la hora: ");
        Scanner horas = new Scanner(System.in);
        int hora = horas.nextInt();

        System.out.print("Introduce los minutos: ");
        Scanner minutos = new Scanner(System.in);
        int minuto = minutos.nextInt();

        int segundos_pasados = (hora * 3600) + (minuto * 60);
        int segundos_restantes = (24 * 3600) - segundos_pasados;

        System.out.printf("Desde las %02d:%02d hasta la medianoche quedan %d segundos", hora, minuto, segundos_restantes);
    }
}

package Actividad_Aleatorio_reloj.PDF03;

public class PDF03Actividad5 {
    public static void main(String[] args) {
        //Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while .
        int contador = 320;

        while (contador >= 160) {
            System.out.println(contador);
            contador -= 20;
        }
    }
}
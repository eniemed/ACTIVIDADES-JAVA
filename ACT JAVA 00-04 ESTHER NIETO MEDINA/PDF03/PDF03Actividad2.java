package Actividad_Aleatorio_reloj.PDF03;

public class PDF03Actividad2 {
    //Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 100) {
            if (contador % 5 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}

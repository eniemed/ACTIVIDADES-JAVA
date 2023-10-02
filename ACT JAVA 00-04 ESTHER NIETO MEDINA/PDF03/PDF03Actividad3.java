package Actividad_Aleatorio_reloj.PDF03;

public class PDF03Actividad3 {
    public static void main(String[] args) {
        int contador = 0;

        do {
            if (contador % 5 == 0) {
                System.out.println(contador);
            }
            contador++;
        } while (contador <= 100);
    }
}

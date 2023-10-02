package Actividad_Aleatorio_reloj.PDF04;

public class PDF04Actividad12 {
    public static void main(String[] args){

        int linea = 0;

        for (int i = 0; i <= 5000; i++) {
            System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));

            if ((linea++) == 80) {
                linea = 0;
                System.out.println();
            }
        }
    }
}

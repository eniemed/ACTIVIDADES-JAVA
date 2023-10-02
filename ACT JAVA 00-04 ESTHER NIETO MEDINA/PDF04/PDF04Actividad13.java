package Actividad_Aleatorio_reloj.PDF04;

public class PDF04Actividad13 {
    public static void main(String[] args) {

        //Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando los
        //dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.

        var dado1 = 0;
        var dado2 = 1;

        while (dado1 != dado2) {
            dado1 = (int) Math.round(Math.random() * 6);
            dado2 = (int) Math.round(Math.random() * 6);
            System.out.println("DADO 1 = " + dado1);
            System.out.println("DADO 2 = " + dado2);
            System.out.println("-------------------------------");
            System.out.println(" ");
        }
    }
}

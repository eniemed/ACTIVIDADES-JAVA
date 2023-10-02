package Actividad_Aleatorio_reloj.PDF04;

public class PDF04Actividad9 {
    //Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine
    //de generar números hasta que no saque el 24. El programa deberá decir al final cuántos números
    //se han generado.
    public static void main(String[] args) {

        var numRandom = 0;
        while (numRandom != 24) {
            numRandom = (int) (Math.random() * 100);
            System.out.println(numRandom);
        }
    }
}

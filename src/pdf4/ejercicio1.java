package pdf4;

import java.util.Random;

/*
 * 1 - Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total
(los puntos que suman entre los tres dados).
 */
public class ejercicio1 {
    public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random rand = new Random();

        // Tirar tres dados
        int dado1 = rand.nextInt(6) + 1; // Rango de 1 a 6
        int dado2 = rand.nextInt(6) + 1;
        int dado3 = rand.nextInt(6) + 1;

        // Calcular la suma total
        int sumaTotal = dado1 + dado2 + dado3;

        // Mostrar los resultados
        System.out.println("Tirada del dado 1: " + dado1);
        System.out.println("Tirada del dado 2: " + dado2);
        System.out.println("Tirada del dado 3: " + dado3);
        System.out.println("Suma total: " + sumaTotal);
    }
}

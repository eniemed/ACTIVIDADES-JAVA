package pdf4;

import java.util.Random;
import java.util.Scanner;

/*
 * 6 - Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
oportunidades quedan y si el número intro- ducido es menor o mayor que el número secreto.

 */
public class ejercicio6 {
    public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random rand = new Random();

        // Generar un número aleatorio entre 0 y 100
        int numeroSecreto = rand.nextInt(101);

        // Inicializar el número de oportunidades
        int oportunidades = 5;

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Adivina el Número!");
        System.out.println("Tienes " + oportunidades + " oportunidades para adivinar el número secreto.");

        // Bucle principal para las adivinanzas
        while (oportunidades > 0) {
            System.out.print("Ingresa tu adivinanza (entre 0 y 100): ");
            int adivinanza = scanner.nextInt();

            // Verificar si la adivinanza es correcta
            if (adivinanza == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número secreto: " + numeroSecreto);
                break;
            } else if (adivinanza < numeroSecreto) {
                System.out.println("El número secreto es mayor que " + adivinanza + ".");
            } else {
                System.out.println("El número secreto es menor que " + adivinanza + ".");
            }

            // Restar una oportunidad
            oportunidades--;
            if (oportunidades > 0) {
                System.out.println("Te quedan " + oportunidades + " oportunidades.");
            } else {
                System.out.println("Lo siento, has agotado tus oportunidades. El número secreto era " + numeroSecreto + ".");
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}

package pdf4;

import java.util.Random;

/*
 * 2 - Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja
está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por
13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
 */
public class ejercicio2 {
        public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random rand = new Random();

        // Definir los palos y las cartas
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // Seleccionar un palo al azar
        int indicePalo = rand.nextInt(palos.length);
        String paloSeleccionado = palos[indicePalo];

        // Seleccionar una carta al azar
        int indiceCarta = rand.nextInt(cartas.length);
        String cartaSeleccionada = cartas[indiceCarta];

        // Mostrar la carta seleccionada
        System.out.println("Carta seleccionada: " + cartaSeleccionada + " de " + paloSeleccionado);
    }

}

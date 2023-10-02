package pdf4;

import java.util.Random;

/*
 * 3 - Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3,
4, 5, 6, 7, sota, caballo, rey y as.
 */
public class ejercicio3 {
    public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random rand = new Random();

        // Definir los palos y las cartas
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey", "As"};

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

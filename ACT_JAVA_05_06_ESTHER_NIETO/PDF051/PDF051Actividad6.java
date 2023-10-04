import java.util.HashSet;
import java.util.Random;

public class PDF051Actividad6 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][10];
        HashSet<Integer> numerosUsados = new HashSet<>(); //esto construye lo que se llama un set, creo que en este ej es útil
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero;
                do {
                    numero = random.nextInt(1001);  // Números entre 0 y 1000 (incluidos)
                } while (numerosUsados.contains(numero));
                matriz[i][j] = numero;
                numerosUsados.add(numero);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}

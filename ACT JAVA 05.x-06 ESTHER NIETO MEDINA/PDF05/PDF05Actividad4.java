import java.util.Random;

public class PDF05Actividad4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i <= numero.length - 1; i++) {
            Random random = new Random();
            int numeroRandom = random.nextInt(101);

            numero[i] = numeroRandom;
            System.out.println(numero[i]);
        }

        System.out.println("---------------");

        for (int i = 0; i <= cuadrado.length - 1; i++) {
            cuadrado[i] = numero[i] * numero[i];
            System.out.println(cuadrado[i]);

        }

        System.out.println("---------------");

        for (int i = 0; i <= cuadrado.length - 1; i++) {
            cubo[i] = numero[i] * numero[i] * numero[i];
            System.out.println(cubo[i]);
        }

        System.out.println("---------------");

    }
}

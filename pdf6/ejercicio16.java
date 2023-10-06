package pdf6;

public class ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Números capicúa entre 1 y 99999:");

        for (int numero = 1; numero <= 99999; numero++) {
            if (esCapicua(numero)) {
                System.out.println(numero);
            }
        }
    }

    // Función para comprobar si un número es capicúa
    public static boolean esCapicua(int numero) {
        int numOriginal = numero;
        int numInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numInvertido = numInvertido * 10 + digito;
            numero /= 10;
        }

        return numOriginal == numInvertido;
    }
}

package pdf6;

public class ejercicio20a28 {
    // Función para generar un array de tamaño n con números aleatorios en un intervalo dado
    public static int[] generaArrayInt(int n, int minimo, int maximo) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
        }
        return array;
    }

    // Función para encontrar el mínimo en un array
    public static int minimoArrayInt(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    // Función para encontrar el máximo en un array
    public static int maximoArrayInt(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    // Función para calcular la media de un array
    public static double mediaArrayInt(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }

    // Función para verificar si un número está en un array
    public static boolean estaEnArrayInt(int[] array, int numero) {
        for (int num : array) {
            if (num == numero) {
                return true;
            }
        }
        return false;
    }

    // Función para encontrar la posición de un número en un array
    public static int posicionEnArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1; // Devuelve -1 si el número no se encuentra en el array
    }

    // Función para voltear un array
    public static void volteaArrayInt(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;
            inicio++;
            fin--;
        }
    }

    // Función para rotar un array a la derecha n posiciones
    public static void rotaDerechaArrayInt(int[] array, int n) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[(i + n) % array.length] = array[i];
        }
        System.arraycopy(temp, 0, array, 0, array.length);
    }

    // Función para rotar un array a la izquierda n posiciones
    public static void rotaIzquierdaArrayInt(int[] array, int n) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[(i + n) % array.length];
        }
        System.arraycopy(temp, 0, array, 0, array.length);
    }
}

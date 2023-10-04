public class PDF06Actividad15 {
    public static boolean numPrimo(int numero) {

        //Muestra los números primos que hay entre 1 y 1000.

        if (numero == 1 || numero == 4 || numero == 0) { //según lo que he leido estos casos son especiales donde el codigo puede fallar, así que
            //por si acaso lo voy a controlar en el if
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (numPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}

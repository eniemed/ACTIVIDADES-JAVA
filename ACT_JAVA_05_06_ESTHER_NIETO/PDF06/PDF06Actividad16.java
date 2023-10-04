import java.util.Arrays;

public class PDF06Actividad16 {
    public static void main(String[] args) {
        //num capicua entre 1 y 99999
        String[] arrayCadena = new String[99999];
        for (int i = 1; i <= 99999; i++) {
            String numCadena = String.valueOf(i);
            arrayCadena[i-1] = numCadena;
        }

        StringBuilder cadenaReversa = new StringBuilder();
        for (String elemento : arrayCadena) {

            for (int i = elemento.length(); i >= 0; i++) {
                cadenaReversa.append(i);
            }
            System.out.println(cadenaReversa);
        }
    }
}

package ACT_JAVA_05_06_ESTHER_NIETO.PDF05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PDF05Actividad10 {
    public static void main(String[] args) {
        //Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en
        //un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones
        //del array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays
        //auxiliares si es necesario.74 Arrays

        ArrayList<Integer> arrayNum = new ArrayList<>(20);
        for (int i = 0; i < 20; i++){
            int random = (int) (Math.random() * 100 + 1);
            arrayNum.add(random);
        }
        System.out.println(arrayNum);

        for (int i = 0; i < 20; i++) {
            ArrayList<Integer> arrayPares = new ArrayList<>();
            ArrayList<Integer> arrayImpares = new ArrayList<>();

            if (arrayNum.get(i) % 2 == 0) {
                arrayPares.add(arrayNum.get(i));
            } else {
                arrayImpares.add(arrayNum.get(i));
            }
        }
    }
}

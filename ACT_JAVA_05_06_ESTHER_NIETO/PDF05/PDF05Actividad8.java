package ACT_JAVA_05_06_ESTHER_NIETO.PDF05;

import java.util.ArrayList;
import java.util.Scanner;

public class PDF05Actividad8 {
    public static void main(String[] args) {
        //Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado
        //año y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras
        //del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.

        Scanner scannerTemp = new Scanner(System.in);
        String[] arrayMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int[] arrayTemp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        var simbolo = "*";

        for (int i = 0; i < 12; i++) {
            System.out.println("Indica la temperatura media en " + arrayMeses[i]);
            int temperatura = scannerTemp.nextInt();
            arrayTemp[i] = temperatura;
        }

        for (int i = 0; i < arrayTemp.length; i++){
            System.out.println(arrayMeses[i] + "          " + simbolo.repeat(arrayTemp[i]));
        }
    }
}

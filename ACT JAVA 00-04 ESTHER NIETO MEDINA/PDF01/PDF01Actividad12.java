package Actividad_Aleatorio_reloj.PDF01;

import java.util.Scanner;

public class PDF01Actividad12 {
    public static void main(String[] args) {
        /*
        Introduzca la base imponible: 25
        Introduzca el tipo de IVA (general, reducido o superreducido): 21%, 10% y 4%
        Introduzca el código promocional (nopro, mitad, meno5 o 5porc): no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%
        Base imponible
        25.00
        IVA (10\%)
        2.50
        Precio con IVA
        27.50
        Cód. promo. (mitad): -13.75
        TOTAL
        13.75
         */

        double iva;
        double resultado;
        String numero_iva = "";

        Scanner base_imponible = new Scanner(System.in);
        System.out.println("Introduzca la base imponible: ");
        double baseImponible = base_imponible.nextDouble();

        Scanner tipo_iva = new Scanner(System.in);
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIva = tipo_iva.next();
        if (tipoIva.equals("general")) {
            iva = baseImponible * ((double) 21 / 100);
            numero_iva = "21";
        } else if (tipoIva.equals("reducido")) {
            iva = baseImponible * ((double) 10 / 100);
            numero_iva = "10";
        } else {
            iva = baseImponible * ((double) 4 / 100);
            numero_iva = "4";
        }

        double totalSinCod = baseImponible + iva;

        Scanner cod_promo = new Scanner(System.in);
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codPromo = cod_promo.next();
        if (codPromo.equals("nopro")) {
            resultado = totalSinCod;
        } else if (codPromo.equals("mitad")) {
            resultado = totalSinCod / 2;
        } else if (codPromo.equals("meno5")) {
            resultado = totalSinCod - 5;
        } else {
            resultado = totalSinCod - (totalSinCod * 0.05);
        }

        System.out.println("Base imponible: \n " + baseImponible);
        System.out.println("IVA " + "(" + numero_iva + "%) \n" + iva);
        System.out.println("Precio sin IVA: \n " + totalSinCod);
        System.out.println("Cód. Promo. (" + codPromo + ") " + (resultado - totalSinCod));
        System.out.println("TOTAL: \n " + resultado);


        //(nopro, mitad, meno5 o 5porc): no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%
    }
}

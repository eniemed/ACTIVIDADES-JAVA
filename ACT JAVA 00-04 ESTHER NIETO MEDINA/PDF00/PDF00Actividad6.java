package Actividad_Aleatorio_reloj.PDF00;

public class PDF00Actividad6 {
    public static void main(String[] args) {

        double base_imponible = 13.0 + 34.60 + 10.20 + 5.0;
        double iva = base_imponible * (21.0 / 100.0);
        double total = base_imponible + iva;

        System.out.println("El total de la factura es de " + total + " euros con iva y de " + base_imponible + " euros sin iva");

    }
}

import java.util.Scanner;

public class PDF02Actividad1 {
    public static void main(String[] args) {

        System.out.println("Introduce el día de la semana: ");
        Scanner miDia = new Scanner(System.in);
        String dia = miDia.next();

        switch (dia) {
            case "lunes" -> System.out.println("Desarrollo web entorno servidor");
            case "martes" -> System.out.println("Desarrollo web entorno cliente");
            case "miércoles" -> System.out.println("Despliegue de aplicaciones web");
            case "jueves" -> System.out.println("Empresa");
            case "viernes" -> System.out.println("Diseño de interfaces web");
        }
    }
}

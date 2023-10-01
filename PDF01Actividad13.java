import java.util.Scanner;

public class PDF01Actividad13 {
    public static void main(String[] args) {

        System.out.println("Introduce la nota del primer examen: ");
        Scanner miNota = new Scanner(System.in);
        double nota1 = miNota.nextDouble();

        System.out.println("¿Qué nota quieres sacar en el trimestre?: ");
        Scanner miNota2 = new Scanner(System.in);
        double nota2 = miNota2.nextDouble();

        double resultado = ((nota2 * 100) - (nota1 * 40)) / 60;

        System.out.println("Para tener un " + nota2 + " en el trimestre necesitas sacar un " + resultado + " en el segundo examen.");

    }
}

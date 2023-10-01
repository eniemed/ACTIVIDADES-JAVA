import java.util.Scanner;

public class PDF02Actividad7 {
    public static void main(String[] args) {
        System.out.println("Introduce la primera nota: ");
        Scanner miNota = new Scanner(System.in);
        double nota1 = miNota.nextDouble();

        System.out.println("Introduce la segunda nota: ");
        Scanner miNota2 = new Scanner(System.in);
        double nota2 = miNota2.nextDouble();

        System.out.println("Introduce la tercera nota: ");
        Scanner miNota3 = new Scanner(System.in);
        double nota3 = miNota3.nextDouble();

        double resultado = (nota1 + nota2 + nota3) / 3;

        System.out.println(resultado);
    }
}

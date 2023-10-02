import java.util.Scanner;

public class PDF02Actividad8 {
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

        int resultado = (int) ((nota1 + nota2 + nota3) / 3);

        if (resultado >= 0.00 && resultado < 5.00) {
            System.out.println(resultado + "\n INSUFICIENTE");
        } else if (resultado == 5.00) {
            System.out.println(resultado + "\n SUFICIENTE");
        } else if (resultado >= 6.00 && resultado <= 7.00) {
            System.out.println(resultado + "\n BIEN");
        } else if (resultado >= 8.00 && resultado <= 9.00) {
            System.out.println(resultado + "\n NOTABLE");
        }  else System.out.println(resultado + "\n SOBRESALIENTE");

    }
}

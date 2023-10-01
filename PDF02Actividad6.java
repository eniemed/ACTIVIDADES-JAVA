import java.util.Scanner;

public class PDF02Actividad6 {
    public static void main(String[] args) {

        System.out.print("Introduce los metros desde los que caerá el objeto: ");
        Scanner h_incog = new Scanner(System.in);
        double h = h_incog.nextDouble();

        double g = 9.81;
        double s = Math.sqrt(2 * h / g);

        System.out.printf("El objeto tarda " + s + " segundos en caer.");
    }
}

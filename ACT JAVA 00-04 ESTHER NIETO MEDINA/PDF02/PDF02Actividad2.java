import java.util.Scanner;

public class PDF02Actividad2 {
    public static void main(String[] args) {

        System.out.println("Introduce la hora: ");
        Scanner miHora = new Scanner(System.in);
        int hora = miHora.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("¡Buenos días!");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("¡Buenas tardes!");
        } else System.out.println("¡Buenas noches!");
    }
}

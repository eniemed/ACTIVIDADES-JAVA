import java.util.Scanner;

public class PDF02Actividad3 {
    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        Scanner miNum = new Scanner(System.in);
        int numero = miNum.nextInt();

        switch (numero) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
        }
    }
}

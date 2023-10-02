import java.util.Scanner;

public class PDF02Actividad4 {
    public static void main(String[] args) {

        int sueldoSemanal;

        System.out.print("Introduzca el número de horas trabajadas esta semana: ");
        Scanner horas = new Scanner(System.in);
        int horasSemanales = horas.nextInt();

        if (horasSemanales <= 40) {
            sueldoSemanal = 12 * horasSemanales;
        } else {
            sueldoSemanal = (40 * 12) + ((horasSemanales - 40) * 16);
        }
        System.out.println("Su sueldo de esta semana es de " + sueldoSemanal + " euros");

    }
}

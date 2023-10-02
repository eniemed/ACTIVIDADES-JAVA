package pdf2;

import java.util.Scanner;

/*
 * 22 - Realiza un programa que, dado un día de la semana 
 * (de lunes a viernes) y una hora (horas y
minutos), calcule cuántos minutos faltan para el fin de semana.
 Se considerará que el fin de semana
comienza el viernes a las 15:00h. Se da por hecho que el usuario 
introducirá un día y hora correctos,
anterior al viernes a las 15:00h.
 */
public class Ejercicio22 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un día de la semana (lunes a viernes): ");
        String diaSemana = scanner.nextLine();

        System.out.print("Introduce la hora (formato 24 horas): ");
        int hora = scanner.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = scanner.nextInt();

        // Calcula los minutos hasta el fin de semana
        int minutosHastaFinDeSemana = calcularMinutosHastaFinDeSemana(diaSemana, hora, minutos);

        System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana.");

        scanner.close();
    }

    // Función para calcular los minutos hasta el fin de semana
    public static int calcularMinutosHastaFinDeSemana(String diaSemana, int hora, int minutos) {
        // Definir el número de minutos en un día (24 horas)
        int minutosPorDia = 24 * 60;

        // Definir el número de minutos hasta el inicio del fin de semana (viernes 15:00h)
        int minutosHastaFinDeSemana = (4 * minutosPorDia) + (15 * 60);

        // Días hábiles restantes hasta el fin de semana (lunes a jueves)
        int diasRestantes = 0;
        switch (diaSemana.toLowerCase()) {
            case "lunes":
                diasRestantes = 4;
                break;
            case "martes":
                diasRestantes = 3;
                break;
            case "miércoles":
                diasRestantes = 2;
                break;
            case "jueves":
                diasRestantes = 1;
                break;
            default:
                break;
        }

        // Calcula los minutos restantes en el día actual
        int minutosRestantesEnDia = (24 * 60) - (hora * 60 + minutos);

        // Suma los minutos restantes en el día actual a los minutos hasta el fin de semana
        minutosHastaFinDeSemana += (diasRestantes * minutosPorDia) + minutosRestantesEnDia;

        return minutosHastaFinDeSemana;
    }
}

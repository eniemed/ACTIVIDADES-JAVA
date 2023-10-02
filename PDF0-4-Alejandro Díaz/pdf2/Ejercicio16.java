package pdf2;

import java.util.Scanner;
/*
 * 16 - Realiza un programa que nos diga si hay probabilidad 
 * de que nuestra pareja nos está siendo infiel. El programa 
 * irá haciendo preguntas que el usuario contestará con 
 * verdadero o falso. Cada
pregunta contestada como verdadero sumará 3 puntos. 
Las preguntas contestadas con falso no
suman puntos. Utili- za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
del programa
 */
public class Ejercicio16 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Test de Infidelidad");
        System.out.println("Responde con 'verdadero' o 'falso' a las siguientes preguntas:");

        int puntuacion = 0;

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("9. Has notado que últimamente se perfuma más.");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        if (scanner.next().equalsIgnoreCase("verdadero")) {
            puntuacion += 3;
        }

        System.out.println("Tu puntuación es: " + puntuacion);

        if (puntuacion >= 0 && puntuacion <= 10) {
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (puntuacion >= 11 && puntuacion <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (puntuacion >= 23 && puntuacion <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }

        scanner.close();
    } 
}

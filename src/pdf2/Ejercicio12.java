package pdf2;

import java.util.Scanner;

public class Ejercicio12 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puntaje = 0; // Inicializamos el puntaje en 0

        System.out.println("¡Bienvenido al minicuestionario sobre lenguaje de marcas!");
        System.out.println("Responde las siguientes 10 preguntas:");

        // Pregunta 1
        System.out.println("\n1. ¿Qué significa HTML?");
        System.out.println("a) Hyper Text Markup Language");
        System.out.println("b) High-Level Text Machine Language");
        System.out.println("c) Hyperlink and Text Markup Language");
        System.out.println("d) Home Tool Markup Language");
        System.out.print("Tu respuesta: ");
        char respuesta1 = scanner.next().charAt(0);
        if (respuesta1 == 'a' || respuesta1 == 'A') {
            puntaje++;
        }

        // Pregunta 2
        System.out.println("\n2. ¿Cuál de las siguientes etiquetas se utiliza para crear un enlace en HTML?");
        System.out.println("a) <link>");
        System.out.println("b) <a>");
        System.out.println("c) <url>");
        System.out.println("d) <anchor>");
        System.out.print("Tu respuesta: ");
        char respuesta2 = scanner.next().charAt(0);
        if (respuesta2 == 'b' || respuesta2 == 'B') {
            puntaje++;
        }

        // Pregunta 3
        System.out.println("\n3. ¿Qué etiqueta se usa para agregar una imagen en HTML?");
        System.out.println("a) <img>");
        System.out.println("b) <picture>");
        System.out.println("c) <image>");
        System.out.println("d) <src>");
        System.out.print("Tu respuesta: ");
        char respuesta3 = scanner.next().charAt(0);
        if (respuesta3 == 'a' || respuesta3 == 'A') {
            puntaje++;
        }

        // Pregunta 4
        System.out.println("\n4. ¿Cuál es el elemento raíz de un documento HTML?");
        System.out.println("a) <html>");
        System.out.println("b) <head>");
        System.out.println("c) <body>");
        System.out.println("d) <root>");
        System.out.print("Tu respuesta: ");
        char respuesta4 = scanner.next().charAt(0);
        if (respuesta4 == 'a' || respuesta4 == 'A') {
            puntaje++;
        }

        // Pregunta 5
        System.out.println("\n5. ¿Cómo se comenta una línea en HTML?");
        System.out.println("a) // Comentario");
        System.out.println("b) /* Comentario */");
        System.out.println("c) <!-- Comentario -->");
        System.out.println("d) % Comentario %");
        System.out.print("Tu respuesta: ");
        char respuesta5 = scanner.next().charAt(0);
        if (respuesta5 == 'c' || respuesta5 == 'C') {
            puntaje++;
        }

        // Pregunta 6
        System.out.println("\n6. ¿Cuál es el elemento que define el título de una página web en HTML?");
        System.out.println("a) <title>");
        System.out.println("b) <header>");
        System.out.println("c) <h1>");
        System.out.println("d) <meta>");
        System.out.print("Tu respuesta: ");
        char respuesta6 = scanner.next().charAt(0);
        if (respuesta6 == 'a' || respuesta6 == 'A') {
            puntaje++;
        }

        // Pregunta 7
        System.out.println("\n7. ¿Cuál de las siguientes etiquetas se utiliza para crear una lista desordenada en HTML?");
        System.out.println("a) <ul>");
        System.out.println("b) <ol>");
        System.out.println("c) <li>");
        System.out.println("d) <dl>");
        System.out.print("Tu respuesta: ");
        char respuesta7 = scanner.next().charAt(0);
        if (respuesta7 == 'a' || respuesta7 == 'A') {
            puntaje++;
        }

        // Pregunta 8
        System.out.println("\n8. ¿Cuál es el propósito de la etiqueta <meta> en HTML?");
        System.out.println("a) Agregar imágenes");
        System.out.println("b) Definir un título");
        System.out.println("c) Especificar metadatos");
        System.out.println("d) Crear enlaces");
        System.out.print("Tu respuesta: ");
        char respuesta8 = scanner.next().charAt(0);
        if (respuesta8 == 'c' || respuesta8 == 'C') {
            puntaje++;
        }

        // Pregunta 9
        System.out.println("\n9. ¿Cuál es el atributo que se utiliza para enlazar una hoja de estilos externa en HTML?");
        System.out.println("a) src");
        System.out.println("b) link");
        System.out.println("c) href");
        System.out.println("d) style");
        System.out.print("Tu respuesta: ");
        char respuesta9 = scanner.next().charAt(0);
        if (respuesta9 == 'c' || respuesta9 == 'C') {
            puntaje++;
        }

        // Pregunta 10
        System.out.println("\n10. ¿Qué significa CSS en el contexto de diseño web?");
        System.out.println("a) Cascading Style Sheets");
        System.out.println("b) Computer Style Sheets");
        System.out.println("c) Creative Style Sheets");
        System.out.println("d) Colorful Style Sheets");
        System.out.print("Tu respuesta: ");
        char respuesta10 = scanner.next().charAt(0);
        if (respuesta10 == 'a' || respuesta10 == 'A') {
            puntaje++;
        }

        // Muestra el puntaje final
        System.out.println("\n¡Cuestionario completado!");
        System.out.println("Tu puntaje final es: " + puntaje + " puntos.");

        scanner.close();
    }
}

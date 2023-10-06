package pdf51;

public class ejercicio1 {
    public static void main(String[] args) {
        // Definir un array de 3 filas por 6 columnas
        int[][] num = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };

        // Mostrar el contenido del array en forma de tabla
        for (int fila = 0; fila < num.length; fila++) {
            for (int columna = 0; columna < num[0].length; columna++) {
                System.out.print(num[fila][columna] + "\t"); // \t para tabular
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}

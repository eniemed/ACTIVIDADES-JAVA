package Pdf0;


/*
1 - Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores 144 y
999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
resta, la división y la multiplicación.

 */
class Ejercicio1 {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;
        int suma = x + y;
        int resta = x - y;
        double division = (double) x/ y;
        int multiplicacion = x * y;

        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        System.out.println("La suma de x e y es: " + suma);
        System.out.println("La resta de x y y es: " + resta);
        System.out.println("La división de x entre y es: " + division);
        System.out.println("La multiplicación de x e y es: " + multiplicacion);
    }
}
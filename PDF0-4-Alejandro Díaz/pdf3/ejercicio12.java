package pdf3;

import java.util.Scanner;

/*
* 12 -  Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores,
por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
debe introducir por teclado.

 */
public class ejercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce cuantas veces quieres que se realize la serie de Fibonacci  : ");
        Integer  n = scanner.nextInt();
        Integer primerTermino = 0;
        Integer segundoTermino = 1;
        for (int i = 0 ; i<n; i++){
            System.out.println(primerTermino+ ",");
            int siguienteTermino = primerTermino + segundoTermino;
            primerTermino = segundoTermino;
            segundoTermino = siguienteTermino;
            

        }
    }
};


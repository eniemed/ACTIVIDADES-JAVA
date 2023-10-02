package pdf2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 13 - Escribe un programa que ordene tres números enteros 
 * introducidos por teclado.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce 3 números enterios");

        
        System.out.print("Número 1: ");
        numeros.add(scanner.nextInt());

        System.out.print("Número 2: ");
        numeros.add(scanner.nextInt());

        System.out.print("Número 3: ");
        numeros.add(scanner.nextInt());;

        Collections.sort(numeros);

        System.out.println("Números ordenados en orden ascendente: " + numeros);

        scanner.close();

    }
}

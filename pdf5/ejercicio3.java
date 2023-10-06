package pdf5;

import java.util.Scanner;

/*
3 - Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es
decir, el primero que se introduce es el último en mostrarse y viceversa.
 */
public class ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer[] listaAlreves = new Integer[11];
        for (int i=10; i>0 ; i--){
            System.out.print("Escribe un numero por teclado : ");
            int num = scanner.nextInt();
            listaAlreves[i]=num;
        }

        for(int i=0 ; i < listaAlreves.length;i++){
            System.out.println(listaAlreves[i]);
        }
        scanner.close();
    }
}

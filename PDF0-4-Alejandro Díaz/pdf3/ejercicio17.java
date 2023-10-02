package pdf3;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroInicial;
        int suma = 0;

        // Pedir al usuario un número positivo
        do {
            System.out.print("Ingrese un número entero y positivo: ");
            numeroInicial = scanner.nextInt();
            
            if (numeroInicial <= 0) {
                System.out.println("El número debe ser positivo. Intente de nuevo.");
            }
        } while (numeroInicial <= 0);

        scanner.close();

        // Calcular la suma de los 100 números siguientes
        for (int i = 1; i <= 100; i++) {
            suma += numeroInicial + i;
        }

        System.out.println("La suma de los 100 números siguientes a " + numeroInicial + " es: " + suma);
    }
}

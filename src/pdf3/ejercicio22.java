package pdf3;

public class ejercicio22 {
    public static void main(String[] args) {
        int limiteSuperior = 100;
        
        System.out.println("Números primos entre 2 y " + limiteSuperior + ":");
        
        for (int numero = 2; numero <= limiteSuperior; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }
    
    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        if (numero <= 3) {
            return true;
        }
        
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= numero; i = i + 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}

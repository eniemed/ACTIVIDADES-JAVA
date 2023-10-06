package pdf6;

public class ejercicio1a14 {
    // Función para comprobar si un número es capicúa
    public static boolean esCapicua(int numero) {
        int numOriginal = numero;
        int numInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numInvertido = numInvertido * 10 + digito;
            numero /= 10;
        }

        return numOriginal == numInvertido;
    }

    // Función para comprobar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para obtener el siguiente número primo mayor que el número dado
    public static int siguientePrimo(int numero) {
        int siguiente = numero + 1;
        while (true) {
            if (esPrimo(siguiente)) {
                return siguiente;
            }
            siguiente++;
        }
    }

    // Función para calcular la potencia de un número
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Función para contar el número de dígitos en un número entero
    public static int digitos(int numero) {
        return Integer.toString(numero).length();
    }

    // Función para voltear un número
    public static int voltea(int numero) {
        int numVolteado = 0;
        while (numero > 0) {
            int digito = numero % 10;
            numVolteado = numVolteado * 10 + digito;
            numero /= 10;
        }
        return numVolteado;
    }

    // Función para obtener un dígito en una posición específica
    public static int digitoN(int numero, int posicion) {
        String numeroStr = Integer.toString(numero);
        if (posicion >= 0 && posicion < numeroStr.length()) {
            char digitoChar = numeroStr.charAt(posicion);
            return Character.getNumericValue(digitoChar);
        } else {
            return -1;
        }
    }

    // Función para encontrar la posición de la primera ocurrencia de un dígito en un número
    public static int posicionDeDigito(int numero, int digito) {
        String numeroStr = Integer.toString(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            if (Character.getNumericValue(numeroStr.charAt(i)) == digito) {
                return i;
            }
        }
        return -1;
    }

    // Función para quitar n dígitos por detrás (derecha)
    public static int quitaPorDetras(int numero, int n) {
        for (int i = 0; i < n; i++) {
            numero /= 10;
        }
        return numero;
    }

    // Función para quitar n dígitos por delante (izquierda)
    public static int quitaPorDelante(int numero, int n) {
        String numeroStr = Integer.toString(numero);
        if (n >= 0 && n < numeroStr.length()) {
            return Integer.parseInt(numeroStr.substring(n));
        } else {
            return 0;
        }
    }

    // Función para añadir un dígito por detrás
    public static int pegaPorDetras(int numero, int digito) {
        return numero * 10 + digito;
    }

    // Función para añadir un dígito por delante
    public static int pegaPorDelante(int numero, int digito) {
        String numeroStr = Integer.toString(numero);
        String resultadoStr = digito + numeroStr;
        return Integer.parseInt(resultadoStr);
    }

    // Función para obtener un trozo de número entre las posiciones inicial y final
    public static int trozoDeNumero(int numero, int inicio, int fin) {
        String numeroStr = Integer.toString(numero);
        if (inicio >= 0 && inicio <= fin && fin < numeroStr.length()) {
            String trozoStr = numeroStr.substring(inicio, fin + 1);
            return Integer.parseInt(trozoStr);
        } else {
            return 0;
        }
    }

    // Función para unir dos números para formar uno
    public static int juntaNumeros(int numero1, int numero2) {
        String numero1Str = Integer.toString(numero1);
        String numero2Str = Integer.toString(numero2);
        String resultadoStr = numero1Str + numero2Str;
        return Integer.parseInt(resultadoStr);
    }

    public static void main(String[] args) {
        // Ejemplos de uso de las funciones
        System.out.println("Es capicúa: " + esCapicua(121));
        System.out.println("Es primo: " + esPrimo(13));
        System.out.println("Siguiente primo: " + siguientePrimo(17));
        System.out.println("Potencia: " + potencia(2, 3));
        System.out.println("Número de dígitos: " + digitos(12345));
        System.out.println("Número volteado: " + voltea(12345));
        System.out.println("Dígito en posición 2: " + digitoN(12345, 2));
        System.out.println("Posición del dígito 4: " + posicionDeDigito(12345, 4));
        System.out.println("Quitar por detrás: " + quitaPorDetras(12345, 2));
        System.out.println("Quitar por delante: " + quitaPorDelante(12345, 2));
        System.out.println("Pegar por detrás: " + pegaPorDetras(123, 4));
        System.out.println("Pegar por delante: " + pegaPorDelante(123, 4));
        System.out.println("Trozo de número: " + trozoDeNumero(12345, 1, 3));
        System.out.println("Unir números: " + juntaNumeros(12, 34));
    }
}


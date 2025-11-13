package clases;

public class Algoritmos {
    // Metodo estatico para numero par
    public static boolean esPar(int numero){
        return numero % 2 == 0;
        // if(numero % 2 == 0){
        //     return true;
        // } else
        // return false;        
    }

    // Metodo string en reversa
    public static String stringEnReversa(String texto){
        // Valeria
        String reversa = "";
        for(int i = texto.length() - 1; i >= 0; i-- ){
            reversa += texto.charAt(i);
        }
        // airelaV == false
        // ana == true
        return reversa;
    }

    // Metodo palidromo
    public static boolean esPalindromo(String texto){
        // toLowerCase();
        String reversa = stringEnReversa(texto).toLowerCase();
        return texto.toLowerCase().equals(reversa);
    }

    // Metodo fizzbuzz
    public static void secuenciaFizzBuzz(int numero){
        for(int i = 1; i<numero; i++){
            if (i % 3 == 0  && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if( i % 3 == 0){
                System.out.println("Fizz");
            } else if( i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        } 
    }

    // Metodo numero primo
    public static boolean esPrimo(int numero){
        if(numero <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean esPrimo2(int numero){
        if(numero <= 1){
            return false;
        }

        for(int i = 2; i <= numero / 2; i++){
            if (numero % i == 0) {
                return false; //Si tiene un divisor durante el ciclo quiere decir que no es primo
            }
        }

        return true; // Sino tuvo otro divisor aparte de 1 y el mismo, entonces es primo
    }
}

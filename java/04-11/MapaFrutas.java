import java.util.HashMap;
import java.util.Set;


public class MapaFrutas {

    public static void main(String[] args){

        // Declaramos el hashmap
        HashMap<String, Integer> frutas = new HashMap<String, Integer>();

        // Agregar frutas a nuestro hashmap
        frutas.put("Pera", 6);
        frutas.put("Naranajas", 10);
        frutas.put("Toronjas", 2);
        frutas.put("Manzanas", 4);
        frutas.put("Banano", 5);

        // Buscar una fruta - Banano
        System.out.println("------------- Primer interaccion ----------------------");
        String frutaBuscada = "Banano";
        int frutaCantidad = frutas.get(frutaBuscada);
        System.out.println("La fruta buscada es " + frutaBuscada + " la cantidad a comprar es " + frutaCantidad);

        System.out.println("------------- Segunda interaccion ----------------------");
        Set<String> claves = frutas.keySet();
        for(String clave : claves){
            System.out.println("Fruta a comprar es: " +  clave + " y la cantidad a comprar es : " + frutas.get(clave));
        }

    }
}
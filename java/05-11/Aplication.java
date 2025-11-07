import java.util.Scanner;
public class Aplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Crear un objeto de Pokemon (Pikachu)
        Pokemon pikachu = new Pokemon("Pikachu", "Electrico", 120, 50, 90);
        Pokemon charmander = new Pokemon("Charmander", "Fuego");
        Pokemon togepi = new Pokemon("Togepi");

        // Mostrar info de los getters 05-11
        // System.out.println("Nombre de mi pokemon: " + pikachu.getNombre() + " ademas es tipo: " + pikachu.getTipo());
        // System.out.println("Puntos de salud: (actualmente) " + pikachu.getPuntosSalud());
        // pikachu.setPuntosSalud(140);
        // System.out.println("Nuevos puntos de salud, por usar la capa: " + pikachu.getPuntosSalud());


        // Mostrar info  06-11
        pikachu.mostrarInfoPokemon();
        charmander.mostrarInfoPokemon();
        togepi.mostrarInfoPokemon();

        // Eclosionar huevo
        System.out.println("Oh! Este huevo esta a punto de eclosionar " + togepi.getNombre() + " Quieres que eclosione? s/n?");
        String respuesta = scan.nextLine();

        if(respuesta.equalsIgnoreCase("s")){
            togepi.eclosionar();
            togepi.mostrarInfoPokemon();
        } else{
            System.out.println("Nuestro seguira incubandose");
        }

        scan.close();

    }
}

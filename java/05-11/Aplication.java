public class Aplication {
    public static void main(String[] args) {
        
        // Crear un objeto de Pokemon (Pikachu)
        Pokemon pikachu = new Pokemon("Pikachu", "Electrico", 120, 50, 90);

        // Mostrar info de los getters
        System.out.println("Nombre de mi pokemon: " + pikachu.getNombre() + " ademas es tipo: " + pikachu.getTipo());
        System.out.println("Puntos de salud: (actualmente) " + pikachu.getPuntosSalud());
        pikachu.setPuntosSalud(140);
        System.out.println("Nuevos puntos de salud, por usar la capa: " + pikachu.getPuntosSalud());
    }
}

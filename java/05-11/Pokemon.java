import java.util.Random;

public class Pokemon {
    // Atributos de la clase
    private String nombre;
    private String tipo;
    private int puntosSalud;
    private int puntosAtaque;
    private int ataqueEspecial;
    // Atributo nuevo
    private boolean enHuevo;

    // Constructor
    public Pokemon(String nombre, String tipo, int puntosSalud, int puntosAtaque, int ataqueEspecial) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntosSalud = puntosSalud;
        this.puntosAtaque = puntosAtaque;
        this.ataqueEspecial = ataqueEspecial;
        this.enHuevo = false;
    }

    // Constructor sobrecargado 1
    public Pokemon(String nombre, String tipo) {
        this(nombre, tipo, 100, 50, 60);
    }

    // Constructor sin parametros
    public Pokemon() {
        this("Desconocido", "Normal");
    }

    // Constructor para pokemon en huevo
    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.tipo = "Desconocido";
        this.puntosSalud = 0;
        this.puntosAtaque = 0;
        this.ataqueEspecial = 0;
        this.enHuevo = true;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    // Getters y setters nuevos del atributo de huevo
    public boolean isEnHuevo() {
        return enHuevo;
    }

    public void setEnHuevo(boolean enHuevo) {
        this.enHuevo = enHuevo;
    }

    // Metodo de mostrar informacion
    public void mostrarInfoPokemon() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        if (enHuevo) {
            System.out.println("Este huevo aun no ha eclosionado");
        } else {
            System.out.println("Salud: " + puntosSalud);
            System.out.println("Ataque: " + puntosAtaque);
            System.out.println("Ataque especial: " + ataqueEspecial);
        }
        System.out.println("---------------------------------------------------");
    }

    public void eclosionar() {
        if (enHuevo) {
            Random rand = new Random();
            String[] tipos = {
                    "Agua", "Fuego", "Psiquico", "Electrico", "Tierra", "Fantasma", "Volador"
            };

            this.tipo = tipos[rand.nextInt(tipos.length)];
            this.puntosSalud = rand.nextInt(81) + 20;
            this.puntosAtaque = rand.nextInt(81) + 20;
            this.ataqueEspecial = rand.nextInt(81) + 20;
            this.enHuevo = false;

            System.out.println(nombre + "ha eclosionado del huevo! Woohooo");
            System.out.println("Tipo asignado es: " + tipo + " Uy esto tal vez no tenga sentido");
        } else{
            System.out.println("Oye chico chico " + nombre + " ya habia eclosionado");
        }
    }
}
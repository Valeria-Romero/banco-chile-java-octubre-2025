public class Pokemon {
    // Atributos de la clase
    private String nombre;
    private String tipo;
    private int puntosSalud;
    private int puntosAtaque;
    private int ataqueEspecial;

    // Constructor
    public Pokemon(String nombre, String tipo, int puntosSalud, int puntosAtaque, int ataqueEspecial) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntosSalud = puntosSalud;
        this.puntosAtaque = puntosAtaque;
        this.ataqueEspecial = ataqueEspecial;
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

    public int getAtaqueEspecial(){
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial){
        this.ataqueEspecial = ataqueEspecial;
    }
}

public class Felino extends Mamifero {
    private String especie;
    private boolean esCazador;

    public Felino(String nombre, int tiempoVida, String habitat, boolean tienePelaje, String especie, boolean esCazador) {
        super(nombre, tiempoVida, habitat, tienePelaje);
        this.especie = especie;
        this.esCazador = esCazador;
    }

    public void cazar() {
        System.out.println("El felino está cazando su presa");
    }

    public String getEspecie() {
        return especie;
    }

    public boolean esCazador() {
        return esCazador;
    }
}
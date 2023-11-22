
public class Roedor extends Mamifero {
    private boolean roeMadera;
    private boolean viveEnMadriguera;
    
    public Roedor(String nombre, int tiempoVida, String habitat, boolean tienePelaje, boolean roeMadera, boolean viveEnMadriguera) {
        super(nombre, tiempoVida, habitat, tienePelaje);
        this.roeMadera = roeMadera;
        this.viveEnMadriguera = viveEnMadriguera;
    }
    
    public void hacerRuido() {
        System.out.println("El roedor esta haciendo ruido");
    }
    
    public boolean roeMadera() {
        return roeMadera;
    }
    
    public boolean viveEnMadriguera() {
        return viveEnMadriguera;
    }
}
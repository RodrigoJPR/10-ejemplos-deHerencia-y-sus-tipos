
public class Anfibio extends Animal {
    private boolean pasaEtapaLarva;
    private boolean tienePielPermeable;
    
    public Anfibio(String nombre, int tiempoVida, boolean pasaEtapaLarva, boolean tienePielPermeable) {
        super(nombre, tiempoVida);
        this.pasaEtapaLarva = pasaEtapaLarva;
        this.tienePielPermeable = tienePielPermeable;
    }
    
    public void saltar() {
        System.out.println("El anfibio está saltando");
    }
    
    public boolean pasaEtapaLarva() {
        return pasaEtapaLarva;
    }
    
    public boolean tienePielPermeable() {
        return tienePielPermeable;
    }
}
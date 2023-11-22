
public class AveDePresa extends Ave {
    private boolean tieneGarrasAfiladas;
    
    public AveDePresa(String nombre, int tiempoVida, double envergaduraAlas, boolean vuela, boolean tieneGarrasAfiladas) {
        super(nombre, tiempoVida, envergaduraAlas, vuela);
        this.tieneGarrasAfiladas = tieneGarrasAfiladas;
    }
    
    public void cazarPresas() {
        System.out.println("El ave de presa esta cazando sus presas");
    }
    
    public boolean tieneGarrasAfiladas() {
        return tieneGarrasAfiladas;
    }
    
    
} 
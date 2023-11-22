
public class Canino extends Mamifero {
    private String raza;
    private boolean domesticado;
    
    public Canino(String nombre, int tiempoVida, String habitat, boolean tienePelaje, String raza, boolean domesticado) {
        super(nombre, tiempoVida, habitat, tienePelaje);
        this.raza = raza;
        this.domesticado = domesticado;
    }
    
    public void ladrar() {
        System.out.println("El canino está ladrando");
    }
    
    public String getRaza() {
        return raza;
    }
    
    public boolean esDomesticado() {
        return domesticado;
    }
}

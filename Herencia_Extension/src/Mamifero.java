
public class Mamifero extends Animal {
    private String habitat;
    private boolean tienePelaje;
    
    public Mamifero(String nombre, int tiempoVida, String habitat, boolean tienePelaje) {
        super(nombre, tiempoVida);
        this.habitat = habitat;
        this.tienePelaje = tienePelaje;
    }
    
    public void amamantar() {
        System.out.println("El mamifero esta amamantando a su cria");
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public boolean tienePelaje() {
        return tienePelaje;
    }
}
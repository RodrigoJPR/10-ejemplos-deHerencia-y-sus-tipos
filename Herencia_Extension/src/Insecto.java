
public class Insecto extends Animal {
    private int numeroPatas;
    private boolean vuela;
    
    public Insecto(String nombre, int tiempoVida, int numeroPatas, boolean vuela) {
        super(nombre, tiempoVida);
        this.numeroPatas = numeroPatas;
        this.vuela = vuela;
    }
    
    public void volar() {
        System.out.println("El insecto está volando");
    }
    
    public int getNumeroPatas() {
        return numeroPatas;
    }
    
    public boolean puedeVolar() {
        return vuela;
    }
}

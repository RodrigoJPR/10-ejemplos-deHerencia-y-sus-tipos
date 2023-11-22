
public class Ave extends Animal {
    private double envergaduraAlas;
    private boolean vuela;
    
    public Ave(String nombre, int tiempoVida, double envergaduraAlas, boolean vuela) {
        super(nombre, tiempoVida);
        this.envergaduraAlas = envergaduraAlas;
        this.vuela = vuela;
    }
    
    public void volar() {
        System.out.println("El ave esta volando");
    }
    
    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }
    
    public boolean puedeVolar() {
        return vuela;
    }
}
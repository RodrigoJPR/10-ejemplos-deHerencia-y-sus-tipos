
public class Animal {
    private String nombre;
    private int tiempoVida;
    
    public Animal(String nombre, int tiempoVida) {
        this.nombre = nombre;
        this.tiempoVida = tiempoVida;
    }
    
    public void comer() {
        System.out.println("El animal esta comiendo");
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getTiempoVida() {
        return tiempoVida;
    }
}
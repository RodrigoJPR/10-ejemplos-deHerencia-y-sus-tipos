
public class Reptil extends Animal {
    private String tipoEscamas;
    private boolean venenoso;
    
    public Reptil(String nombre, int tiempoVida, String tipoEscamas, boolean venenoso) {
        super(nombre, tiempoVida);
        this.tipoEscamas = tipoEscamas;
        this.venenoso = venenoso;
    }
    
    public void arrastrarse() {
        System.out.println("El reptil se está arrastrando");
    }
    
    public String getTipoEscamas() {
        return tipoEscamas;
    }
    
    public boolean esVenenoso() {
        return venenoso;
    }
}

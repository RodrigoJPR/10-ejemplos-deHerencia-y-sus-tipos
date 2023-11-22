
public class Vehiculo {
    private String marca;
    private int año;
    
    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }
    
    public void conducir() {
        System.out.println("Conduciendo el vehiculo");
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getAño() {
        return año;
    }
}





















public class Automovil extends Vehiculo {
    private String modelo;
    private String color="Red";
	private int capacidadPasajeros;
    private boolean aireAcondicionado;
    
    public Automovil(String marca, int año, int capacidadPasajeros, boolean aireAcondicionado,String model) {
        super(marca, año);
        this.capacidadPasajeros = capacidadPasajeros;
        this.aireAcondicionado = aireAcondicionado;
        modelo=model;
    }
    
    public void transportarPersonas() {
        System.out.println("Transportando personas en el automóvil");
    }
    
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    
    public boolean tieneAireAcondicionado() {
        return aireAcondicionado;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
}
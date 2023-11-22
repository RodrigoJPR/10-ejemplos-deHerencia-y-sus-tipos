
public class Avion extends Vehiculo {
    public Avion(String marca, int año) {
		super(marca, año);
		
	}

	public void volar() {
        System.out.println("Volando en el avión");
    }
}

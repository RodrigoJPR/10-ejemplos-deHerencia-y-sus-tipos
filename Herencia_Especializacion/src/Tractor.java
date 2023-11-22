
public class Tractor extends Vehiculo {
 
	public Tractor(String marca, int año) {
		super(marca, año);
		
	}
	private boolean remolque;
	private boolean dobleTraccion;
	public void trabajarEnElCampo() {
        System.out.println("Trabajando en el campo con el tractor");
    }

	public boolean getRemolque() {
		return remolque;
	}
	public boolean getDobleTraccion() {
		return dobleTraccion;
	}

}
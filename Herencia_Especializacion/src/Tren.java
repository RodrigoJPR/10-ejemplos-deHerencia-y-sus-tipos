
public class Tren extends Vehiculo {
 
	public Tren(String marca, int año) {
		super(marca, año);
		
	}
	private int vagones;
	private boolean vapor;
	
	public void viajarPorVias() {
        System.out.println("Viajando por las vias en el tren");
    }
	
	public int getVagones() {
		return vagones;
	}
	public boolean getVapor() {
		return vapor;
	}

}
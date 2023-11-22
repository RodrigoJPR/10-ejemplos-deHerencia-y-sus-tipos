
public class Helicoptero extends Vehiculo {
	public Helicoptero(String marca, int año) {
		super(marca, año);
		
	}
	private int helices;
	private boolean armado;
	
	
	public void volarVerticalmente() {
        System.out.println("Volando verticalmente en el helicoptero");
    }

	public int getHelices() {
		return helices;
	}
	public boolean getArmado() {
		return armado;
	}

}
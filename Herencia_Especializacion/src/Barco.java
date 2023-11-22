
public class Barco extends Vehiculo {
   
	public Barco(String marca, int año) {
		super(marca, año);
		
	}

	private int niveles;
	private boolean mastil= true;
	
	public void navegar() {
        System.out.println("Navegando en el barco");
    }

	public int getNiveles() {
		return niveles;
	}
	
	public boolean getMastil() {
		return mastil;
	}


}



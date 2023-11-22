
public class Bicicleta extends Vehiculo {
	public Bicicleta(String marca, int año) {
		super(marca, año);
	
	}

	private boolean diablitos= true ;
	
	
    public void pedalear() {
        System.out.println("Pedaleando en la bicicleta");
    
    
   }

    public boolean getDiablitos() {
    	return diablitos;
    }

}
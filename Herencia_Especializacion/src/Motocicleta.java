
public class Motocicleta extends Vehiculo {
    
	public Motocicleta(String marca, int año) {
		super(marca, año);
		
	}


	private boolean manubrio;
	private boolean cadena;
	
	
	public void conducirRapido() {
        System.out.println("Conduciendo rapido en la motocicleta");
    }
}
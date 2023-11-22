
public class Camion extends Vehiculo {
	
	public Camion(String marca, int año) {
		super(marca,año );
		// TODO Auto-generated constructor stub
	}

	private boolean pasajeros;
	private String compañia;
	
    public void transportarCarga() {
        System.out.println("Transportando carga en el camión");
    }
}

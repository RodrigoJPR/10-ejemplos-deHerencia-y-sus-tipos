
public class Aspiradora extends Electrodomestico{

	private String tipo;
	private String typeDeSuccion;
	
	public Aspiradora() {
		super("CAT", "WS-SUPER", 4000);
	}

	public void Aspirar() {
		
	}

	public void Detener() {
		
	}
	
	public String getTipo() {
		return tipo;
		
	}
	
	public String getTypeDeSuccion(){
		return typeDeSuccion;
	}
}



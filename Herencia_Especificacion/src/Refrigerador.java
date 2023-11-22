
public class Refrigerador extends Electrodomestico {

	private String capacidad;
	private String typeOfRefrigeration;
	
	
	public Refrigerador() {
		super("Whirpool", "4000-Star", 14999);
	}
	
	public void Refrigerar() {
		
	}
	
	public String getCapacidad() {
		return capacidad;
	}
	
	public String getTypeOfRefrigeration() {
		return typeOfRefrigeration;
	}
}

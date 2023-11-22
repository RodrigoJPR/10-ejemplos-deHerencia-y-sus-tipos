
public class Electrodomestico {

	private String marca;
	private String modelo;
	private int precio;
	
	public Electrodomestico(String marca, String modelo, int precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
	}
	
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	
	
}

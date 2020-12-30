package desarrollo;

public abstract class Vehiculo {

	private int numeroID;
	private String modelo;
	private String marca;
	private double precio;
	
	public Vehiculo(int numeroID, String modelo, String marca, double precio) {
		super();
		this.numeroID = numeroID;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}

	public int getNumeroID() {
		return numeroID;
	}

	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
}

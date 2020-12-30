package desarrollo;
import java.text.DecimalFormat;
public class Moto extends Vehiculo{

	private String cilindradas;

	public Moto(int numeroID, String modelo, String marca, double precio, String cilindradas) {
		super(numeroID, modelo, marca, precio);
		this.cilindradas = cilindradas;
	}

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$.00");
		return "Marca: " + getMarca() +" // Modelo: " + getModelo()+
				" // cilindradas: " + cilindradas +  " // Precio: " + df.format(getPrecio());
				
	}
	
	
	
}

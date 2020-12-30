package desarrollo;

import java.text.DecimalFormat;

public class Automovil extends Vehiculo{

	private int puerta;

	public Automovil(int numeroID, String modelo, String marca, double precio, int puerta) {
		super(numeroID, modelo, marca, precio);
		this.puerta = puerta;
	}

	public int getPuerta() {
		return puerta;
	}

	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$.00");
		return "Marca: " + getMarca() +" // Modelo: " + getModelo()+
				" // puertas: " + puerta +  " // Precio: " + df.format(getPrecio());
	};
	
	
	
}

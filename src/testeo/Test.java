package testeo;
import desarrollo.AdmVehiculo;

public class Test {

	public static void main(String[] args) {
		AdmVehiculo concesionaria= new AdmVehiculo();
		
		try {
			concesionaria.agregarVehiculo("Peugeot", "206", 4, 200000);
			concesionaria.agregarVehiculo("Honda", "Titan", 125, 60000);
			concesionaria.agregarVehiculo("Peugeot", "208", 5, 250000);
			concesionaria.agregarVehiculo("Yamaha", "YBR", 160, 80500.50);
			
			System.out.print(concesionaria.mostrarLista());
		}
      catch(Exception e) {
    	  System.out.println(e.getMessage());
      }
		
		System.out.println("=============================");
		
		System.out.println("Vehiculo mas caro: "+concesionaria.mayorPrecio());
		System.out.println("Vehiculo mas barato: "+concesionaria.menorPrecio());
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+concesionaria.buscar("Y"));
		
		System.out.println("=============================");
		System.out.println("Vehículos ordenados por precio de mayor a menor: ");
		System.out.println(concesionaria.mostrarEnDescendente());
	}

}

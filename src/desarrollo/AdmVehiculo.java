package desarrollo;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class AdmVehiculo {

	private List<Vehiculo> lstVehiculos;

	public AdmVehiculo() {
		super();
		this.lstVehiculos = new ArrayList<Vehiculo>();
	}

	public List<Vehiculo> getLstVehiculos() {
		return lstVehiculos;
	}

	public void setLstVehiculos(List<Vehiculo> lstVehiculos) {
		this.lstVehiculos = lstVehiculos;
	}
	
	//codigo
	
	public String buscar(String modelo) {
		String encontrado= "";
		DecimalFormat df = new DecimalFormat("$.00");
		for(Vehiculo v : lstVehiculos) {
			if(v.getModelo().contains(modelo)) {
				encontrado= v.getMarca()+" "+v.getModelo() +" "+ df.format(v.getPrecio());
			}	
		}		
		return encontrado;
	}
	
	public Vehiculo traerVehiculo(String modelo) {
		Vehiculo vehiculo=null;
		for(Vehiculo v : lstVehiculos) {
			if(v.getModelo().equalsIgnoreCase(modelo)) {
				vehiculo=v;
			}
		}
		return vehiculo;
	}
	public boolean agregarVehiculo(String marca ,String modelo,int puertas, double precio)throws Exception {
		Vehiculo vehiculo= traerVehiculo(modelo);
		if(vehiculo != null) {
			throw new Exception("El vehiculo con el modelo "+vehiculo.getModelo()+"ya fue ingresado");
		}
		int id= 1;
		if(lstVehiculos.size()>0) {
			id= lstVehiculos.get(lstVehiculos.size()-1).getNumeroID()+1;
		}
		return lstVehiculos.add(new Automovil(id, modelo, marca, precio, puertas));
	}
	
	public boolean agregarVehiculo(String marca ,String modelo,String cilindradas, double precio)throws Exception {
		Vehiculo vehiculo= traerVehiculo(modelo);
		if(vehiculo != null) {
			throw new Exception("El vehiculo con el modelo "+vehiculo.getModelo()+"ya fue ingresado");
		}
		int id= 1;
		if(lstVehiculos.size()>0) {
			id= lstVehiculos.get(lstVehiculos.size()-1).getNumeroID()+1;
		}
		return lstVehiculos.add(new Moto(id, modelo, marca, precio, cilindradas));
	}

	public String mostrarLista() {
		String lista="";
		for(Vehiculo v : lstVehiculos) {
			lista+= v.toString() +"\n";	
		}
		
		
		return lista;
	}
	
	public String mayorPrecio() {
		String vehiculo="";
		double precioMenor=lstVehiculos.get(0).getPrecio();
		for(int i=1; i<lstVehiculos.size();i++) {
			if(lstVehiculos.get(i).getPrecio()>precioMenor) {
				precioMenor=lstVehiculos.get(i).getPrecio();
				vehiculo= lstVehiculos.get(i).getMarca()+" "+lstVehiculos.get(i).getModelo();
			}	
		}
		return vehiculo;
	}
	
	public String menorPrecio() {
		String vehiculo="";
		double precioMenor=lstVehiculos.get(0).getPrecio();
		for(int i=1; i<lstVehiculos.size();i++) {
			if(lstVehiculos.get(i).getPrecio()<precioMenor) {
				precioMenor=lstVehiculos.get(i).getPrecio();
				vehiculo= lstVehiculos.get(i).getMarca()+" "+lstVehiculos.get(i).getModelo();
			}	
		}
		return vehiculo;
	}
	
	private List<Vehiculo> ordenarDescendente(List<Vehiculo> lista){
		List<Vehiculo> listaAux=new ArrayList<Vehiculo>();
		for(int i=0; i<lista.size();i++) {
			for(int x=i+1; x<lista.size();x++) {
				if(lista.get(i).getPrecio()<lista.get(x).getPrecio()) {
					listaAux.add(lista.get(i));
					lista.set(i, lstVehiculos.get(x));
					lista.set(x, listaAux.get(0));
					listaAux= new ArrayList<Vehiculo>();	
				}
			}
		}
		
		return lista;
	}
	
	public String mostrarEnDescendente() {
		String lista= "";
		List <Vehiculo> list= ordenarDescendente(lstVehiculos);	
		for(Vehiculo v : list) {
			lista+= v.getMarca() + " " + v.getModelo()+"\n";
		}
		return lista;
	}
}//cierra clase

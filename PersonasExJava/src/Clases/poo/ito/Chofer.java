package Clases.poo.ito;

import java.util.HashSet;

public class Chofer extends Empleado {

	

	private HashSet<String> rutas = new HashSet<String>();
	public int noAutobus = 0;

	public Chofer(String nombre, String apellido, String email, long celular, String nss, int noEmpleado, float sueldo,
			String puesto,int noAutobus) {
		super(nombre, apellido, email, celular, nss, noEmpleado, sueldo, puesto);
		this.noAutobus = noAutobus;
	}

	public void agregarRuta(String ruta) {
		this.rutas.add(ruta);
	}

	public Boolean eliminaRuta(String ruta) {
		Boolean eliminaRuta =false;
		if(this.rutas.contains(ruta)) {
			this.rutas.remove(ruta);
			eliminaRuta=true;
		}
			
		return eliminaRuta;

	}

	public HashSet<String> getRutas() {
		return this.rutas;
	}

	public int getNoAutobus() {
		return this.noAutobus;
	}

	public void setNoAutobus(int newNoAutobus) {
		this.noAutobus = newNoAutobus;
	}

	@Override
	public String toString() {
		return super.toString()+"[rutas=" + rutas + ", noAutobus=" + noAutobus + "]";
	}

}

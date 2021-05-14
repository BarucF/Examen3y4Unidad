package clases.poo.ito;

import ito.poo.interfaces.Serial;

public class SerialClase implements Serial {

	private long numero;
	private int contador;
	public SerialClase() {
		super();
		this.numero=0;
		this.contador=0;
	}
	
	@Override
	public void reiniciar() {
		this.numero=this.numero-(this.contador*5);
		this.contador=0;
	}

	@Override
	public void iniciar(long x) {
		this.numero=x;
	}

	@Override
	public long siguiente() {
		this.contador=(this.contador+1);
		return this.numero=(this.numero+5L);
	}

}

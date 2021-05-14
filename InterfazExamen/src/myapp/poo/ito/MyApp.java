package myapp.poo.ito;
import clases.poo.ito.SerialClase;
public class MyApp {

	public static void run() {
		SerialClase s=new SerialClase();
		s.iniciar(4351);
		System.out.println(s.siguiente());
		System.out.println(s.siguiente());
		System.out.println(s.siguiente());
		System.out.println(s.siguiente());
		s.reiniciar();
		System.out.println(s.siguiente());
		System.out.println(s.siguiente());
	}
	
	public static void main(String[] args) {
		run();
	}

}

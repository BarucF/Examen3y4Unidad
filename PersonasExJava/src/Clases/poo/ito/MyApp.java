package Clases.poo.ito;
import Clases.poo.ito.Chofer;
public class MyApp {

	public static void run() {
		Chofer c=new Chofer("Mario","Castaņera","MarioCastaņera@gmail.com",2724582454L,"72795608040",340,1500F,"Chofer",14);
		c.agregarRuta("Rio Blanco");
		c.agregarRuta("Puebla");
		c.agregarRuta("Orizaba");
		c.agregarRuta("Cordoba");
		c.agregarRuta("Veracruz");
		c.eliminaRuta("Veracruz");
		
		System.out.println(c.toString());
	}
	
	public static void main(String [] args) {
		run();
	}
}

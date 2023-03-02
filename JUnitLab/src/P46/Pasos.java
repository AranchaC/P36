package P46;

import java.util.Scanner;

public class Pasos {
	protected int numero;//almacena nº de pasos
	 
	
	public Pasos(int numero) {
		super();
		this.numero = numero;
	}


	public String Valoracion(String texto) {
		 String mensaje = "";
		 
		 if (numero<= 1000) {
			 mensaje = "Lleva una vida sedentaria";
		 }
		 
		 if (numero>1000 && numero <=2000) {
			 mensaje = "Lleva una vida poco activa";
		 }
		 
		 if (numero>2000 && numero <=4000) {
			 mensaje = "Se acerca al objetivo";
		 }
		 
		 if (numero>4000 && numero <=6000) {
			 mensaje = "No está mal";
		 }
		 
		 if (numero>6000) {
			 mensaje = "Así se hace";
		 }
		 return mensaje;
	}
	
	

}

package P46;

public class Pasos {
	protected int numero;//almacena nº de pasos
	
	public void Valoracion(int pasos) {
		 numero += pasos;
		 
		 if (pasos<= 1000) {
			 System.out.println("Lleva una vida sedentaria");
		 }
		 
		 if (pasos>1000 && pasos <=2000) {
			 System.out.println("Lleva una vida poco activa");
		 }
		 
		 if (pasos>2000 && pasos <=4000) {
			 System.out.println("Se acerca al objetivo");
		 }
		 
		 if (pasos>4000 && pasos <=6000) {
			 System.out.println("No está mal");
		 }
		 
		 if (pasos>6000) {
			 System.out.println("Así se hace");
		 }
	}
	
	

}

import java.util.Scanner; //Necesario para leer datos del teclado.

public class Numero_Mayor {

	public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);

		    int num;
		    int mayor=0;
		    int cont;
		    int maximo = 3;

	 
		    for(cont=0; cont<maximo; cont++ ){
		        System.out.print("Di un número: ");
		        num = sc.nextInt();
		        if(num>mayor){
		            mayor=num;
		        }
		    }
		    System.out.println("El número mayor es "+mayor);

		}//main
}//class
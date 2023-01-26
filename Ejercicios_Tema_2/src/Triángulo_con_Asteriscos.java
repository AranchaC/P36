
public class Triángulo_con_Asteriscos {


	public static void main(String[] args) {
        int numFilas = 6; //nº de filas que quiero que ocupe la pirámide.
  
        for(int i = 1; i<=numFilas; i++){
        	
            //Función para poner espacios.
            for(int espacios = 1; espacios<=numFilas-i; espacios++){
                System.out.print(" ");
            }//for
 
            //Función para poner asteriscos.
            for(int asteriscos=1; asteriscos<=(i*2)-1; asteriscos++){
                System.out.print("*");
            }//for
            System.out.println();
        }//for
	}//main
}//class


public class Secuencia_deN_al_1_hacia_atrás_ej2 {
	
	public static void main(String[] args) {
		int n=10;
		
        for(int i=n; i>0; --i) {
           for(int num=i; num >0; --num) { 
        	   System.out.print(num + " ");
            }//for
            System.out.println();
        }//for
    }//main
}//class

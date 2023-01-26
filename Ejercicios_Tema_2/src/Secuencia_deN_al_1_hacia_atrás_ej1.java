
public class Secuencia_deN_al_1_hacia_atrás_ej1 {
	
	public static void main(String[] args) {
		int n=10;
		
        for(int num=1; num <= n; ++num) {
           for(int i=n; i>= num; --i) {
        	   System.out.print(i + " ");
            }//for
            System.out.println();
        }//for
    }//main
}//class


public class Secuencia_deN_al_1_hacia_atrás_BIEN {
	
	public static void main(String[] args) {
		final int N=10;//nºinicio de la secuencia
		
		for(int i=N; i>0; i--) {//1er bucle desde N hasta 1
			for (int j=i; j>0; j--) {
				System.out.print(j+" " + "*" + " ");
			}//for
			System.out.println();
		}//for
		System.out.println("*");
    }//main
}//class

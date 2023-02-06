import java.util.Scanner;

public class Medio_Triangulo {

	public static void main(String[] args) {
		/*Scanner entrada=new Scanner(System.in);
		System.out.print("Dame un número impar: ");

        int base = entrada.nextInt();*/
		//commit1 nº5
		//commit2 nº7
		//cambio de 7 a 9
		int base = 9;
        if (base%2==0) {
        	System.out.println("Error");
        }
        else {
        	int mediotri[][]=new int[base][base];
            for (int contB=1; contB<base+1; contB++) {
            	for (int contA=0; contA<contB; contA++) {
            		System.out.print("*");
            	}//for
            	contB++;
            	System.out.println();
            }//for

        }//else
	}//main
}//class
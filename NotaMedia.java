package ExerciciosJava;

import java.util.Scanner;

public class NotaMedia {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float n1,n2,n3,n4,media;
		
		
		
		System.out.println("\n Informe sua primeira nota ");
		n1 = scan.nextFloat();
		
		System.out.println("\n Informe sua segunda nota ");
		n2 = scan.nextFloat();
		
		System.out.println("\n Informe sua terceira nota ");
		n3 = scan.nextFloat();
		
		System.out.println("\n Informe sua quarta nota ");
		n4 = scan.nextFloat();
		
		
		media = (n1+n2+n3+n4) / 4;
		
		System.out.println("\n Sua média final foi de: "+media);
		
		
		
		
		
		
	}
	
	
	
	
	


}

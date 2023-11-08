package ExerciciosJava;

import java.util.Scanner;

public class produto {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float n1,n2,n3,n4,diferenca;
		
		System.out.println("Informe o valor do primeiro produto: ");
		n1 = scan.nextFloat();
		
		System.out.println("Informe o valor do segundo produto: ");
		n2 = scan.nextFloat();
		
		System.out.println("Informe o valor do terceiro produto: ");
		n3 = scan.nextFloat();
		
		System.out.println("Informe o valor do quarto produto: ");
		n4 = scan.nextFloat();
		
		diferenca = (n1 * n2) - (n3*n4);	
		
		System.out.println("A diferença no valor entre os produtos é de R$"+diferenca);
		
		
		
		
		
		
		
		
		
	}

}

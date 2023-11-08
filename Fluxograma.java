package ExerciciosJava;

import java.util.Scanner;

public class Fluxograma {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("\n Informe seu salário: ");
		salario = scan.nextFloat();
		
		System.out.println("\n Informe o valor do abono: ");
		abono = scan.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Esse é seu salário deste mês "+"R$"+novoSalario);
		
		
		
			
	}

}

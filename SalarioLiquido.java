package ExerciciosJava;

import java.util.Scanner;

public class SalarioLiquido {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float salario,noturno,extras,desconto,salarioFinal;
		
		System.out.println("\n Informe seu salario ");
		salario = scan.nextFloat();
		
		System.out.println("\n Informe seu adicional noturno ");
		noturno = scan.nextFloat();
		
		System.out.println("\n Informe seu horas extras ");
		extras = scan.nextFloat();
		
		desconto = 200;
		
		salarioFinal = salario+noturno+(extras*5)-desconto;
		
		System.out.println("\n\n Será descontado do seu salário um total de R$"+desconto);
		
		System.out.println("\n\n O seu salário final é de R$"+salarioFinal);
		
		
		
		
		
		
	}

}

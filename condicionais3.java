package exercicios;

import java.util.Scanner;

public class condicionais3 {

	public static void main(String[] args) {
		
		
		int a;
		
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.printf("Digite um numero: ");
		a = leitor.nextInt(); 
		
		if ( a > 0 )
			System.out.println("Numero positivo.");
		
		else
			System.out.println("Numero negativo.");
		
		
	}

}

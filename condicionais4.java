package exercicios;

import java.util.Scanner;

public class condicionais4 {

	public static void main(String[] args) {
		
		
		int a,b;
		
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.printf("Digite o primeiro numero: ");
		a = leitor.nextInt(); 
		
		
		System.out.printf("Digite o segundo numero: ");
		b = leitor.nextInt(); 
		
		
		if ( a > b ) {
			System.out.print ( a + " e " + b );
		}
		
		else {
			System.out.print ( b + " e " + a );
		}
			
	}

}

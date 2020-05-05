package exercicios;

import java.util.Scanner;

public class condicionais2 {

	public static void main(String[] args) {
		
		
		int a, b;
		int soma;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.printf( "Digite um numero:" );
		a= leitor.nextInt();
		
		System.out.printf( "Digite o segundo numero:" );
		b= leitor.nextInt();
		
		soma= a + b;
		
		if (soma > 10) {
			System.out.printf( "Soma dos numeros: " + soma );
		}
		
		else { 
			System.out.printf("Tente novamente.");
		}
	}
}

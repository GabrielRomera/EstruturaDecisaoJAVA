package exercicios;

import java.util.Scanner;

public class condicionais7 {

	public static void main(String[] args) {
		
		
		String Nome1, Nome2;
		Float Idade1, Idade2;
		
		
		Scanner leitor = new Scanner(System.in);
		

		System.out.printf( "Digite seu nome: " );
		Nome1 = leitor.next();
		
		System.out.printf( "Digite sua idade: " );
		Idade1 = leitor.nextFloat();
		
		
		System.out.printf( "===============================" + "\n");
		
		
		System.out.printf( "Digite seu nome: " );
		Nome2 = leitor.next();
		
		System.out.printf( "Digite sua idade: " );
		Idade2 = leitor.nextFloat();
		
		
		System.out.printf( "===============================" + "\n");
		
		
		if ( Idade1 > Idade2 )
			System.out.printf("Nome: " + Nome1 + "\n" + "Idade: " + Idade1 );
		
		
		else
			System.out.printf("Nome: " + Nome2 + "\n" + "Idade: " + Idade2 );
		
		
	}
	
}

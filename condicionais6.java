package exercicios;

import java.util.Scanner;

public class condicionais6 {

	public static void main(String[] args) {
		
		
		float nota1, nota2, nota3, soma, media;
		
	
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.printf( "Digite a primeira nota: " );
		nota1 = leitor.nextFloat(); 
		
		
		System.out.printf( "Digite a segunda nota: " );
		nota2 = leitor.nextFloat(); 
		
		
		System.out.printf( "Digite a terceira nota: " );
		nota3 = leitor.nextFloat(); 

		
		soma = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
		media = soma / 10 ;
				
		System.out.printf( "Sua media: " +media + "\n");
		
		if(media >= 7)
			System.out.println( "Aluno aprovado." );

		else
			System.out.println( "Aluno reprovado." );
		
		
	}
	
}

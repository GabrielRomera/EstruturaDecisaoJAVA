package exercicios;

import java.util.Scanner;

public class condicionais10 {

	public static void main(String[] args) {
	
		Double altura, masculino, feminino;
		String sexo;
		
		Scanner leitor = new Scanner(System.in);
		
		
		
		System.out.printf( "Digite seu Sexo : [M] ou [F]: " );
		sexo = leitor.next();

		System.out.printf( "Digite sua altura: x,x. " );
		altura = leitor.nextDouble();
		
		
		masculino = ((72.7 * altura) - 58.0);
		feminino = ((62.1 * altura) - 44.7);
			
        
		if ( sexo.equals("M"))
			System.out.printf( "Sexo: Masculino, peso ideal:" +masculino );
		
		else
			System.out.printf("Sexo: Feminino, peso ideal:" +feminino);
	}

}
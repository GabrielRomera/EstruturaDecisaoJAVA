package exercicios;

import java.util.Scanner;

public class condicionais8 {

	public static void main(String[] args) {
		
		String Password; 
		
		Scanner leitor = new Scanner(System.in);
		

		System.out.printf( "Digite a senha: " );
		Password = leitor.next();
		
		
		
		if ( Password.equals("AEDB"))
			System.out.printf( "Bem-vindo usuario." );
		
		else
			System.out.printf("Senha invalida.");
		
	}

}

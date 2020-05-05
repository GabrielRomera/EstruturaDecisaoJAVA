package exercicios;

import java.util.Scanner;

public class condicionais {

	public static void main(String[] args) {
		
		
		int a;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.printf( "Digite um numero:" );
		a= leitor.nextInt();
		
		if( a >= 20 ) {
		System.out.printf("Seu numero:" + a );
		}
		
		else {
		System.out.printf("Tente novamente.");
		
		}
	

	}

}

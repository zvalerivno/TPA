package execicios1;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		
		int numero, fatorial = 1,i = 1;
		
		System.out.println("Digite um número inteiro:");
		numero = in.nextInt();
		
		do {
			fatorial = fatorial*i;
			
			i++;
		}
		
		while( i <= numero);
		
		System.out.println("O fatorial de " +numero+ " é: "+fatorial);
		
		
		
	}
}

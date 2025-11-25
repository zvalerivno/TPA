package execicios1;

import java.util.Scanner;

public class Numero {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um Número:");
		numero = in.nextDouble();
		
		System.out.println("Número: "+numero);
		
				
		if(numero == 0) {
			System.out.println("Neutro");
		}
		
		else if(numero > 0) {
			System.out.println("Positivo");
		}
		
		else {
			System.out.println("Negativo");
		}

	}

}

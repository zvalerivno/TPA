package execicios1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		double salario;
		
		System.out.print("Digite seu salario");
		salario = in.nextDouble();
		
		System.out.println("Sal�rio: "+salario);
		
		if(salario < 1303.00) {
			System.out.println("Abaixo");
		}
		
		else {
			System.out.println("Acima");
		}
		
	
	}
	

}

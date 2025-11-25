package execicios1;

import java.util.Scanner;

public class Celcius2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double c , f;
		
		System.out.println("Digite a quantidade de Fahrenheeit:");
		f = in.nextDouble();
		
		c = (f - 32) / 1.8 ;
		
		System.out.println("A temperatura em Celsius : "+c);
		
		if(c < 0) {
			System.out.println("Frio extremo");
		}
		
		else if(c <= 10) {
			System.out.println("frio");
		}
		
		else if(c <= 20) {
			System.out.println("frio moderado");
		}
		
		else if(c <= 24) {
			System.out.println("clima ameno");
		}
		
		else {
			System.out.println("Calor");
		}
		
	}
}

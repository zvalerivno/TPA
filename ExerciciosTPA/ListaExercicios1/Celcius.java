package execicios1;

import java.util.Scanner;

public class Celcius {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double f, c;
		
		System.out.println("Digite a quantidade de Fahrenheeit:");
		f = in.nextDouble();
		
		c = (f- 32) / 1.8 ;
		
		System.out.println("A temperatura em Celsius: "+c);
		
		if(c<15) {
			System.out.println("Frio");
		}
		
		else if(c>=15 && c<22) {
			System.out.println("Ameno");
		}
		
		else {
			System.out.println("Calor");
		}
		
	}

}

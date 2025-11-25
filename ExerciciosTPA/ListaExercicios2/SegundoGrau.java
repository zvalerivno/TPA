package execicios1;

import java.util.Scanner;

public class SegundoGrau {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a, b, c, delta, raizDelta, x, x1, x2;
		
		System.out.println("Digite o valor de A:");
		a = in.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b = in.nextDouble();
		
		System.out.println("Digite o valor de C:");
		c = in.nextDouble();
		
		delta = b*b-4*a*c;
		
		System.out.println("Delta: "+delta);
		
		if(delta < 0) {
			System.out.println("Não tem raízes reais");
		}
		
		else if(delta == 0) {
			x = -b/(2*a);
			System.out.println("Raiz real: " +x);
		}
		
		else {
			raizDelta = Math.sqrt(delta);
			x1 = (-b + raizDelta) / (2*a);
			x2 = (-b - raizDelta) / (2*a);
			System.out.println("x1: "+x1);
			System.out.println("x2: "+x2);
		}
		

	}
}

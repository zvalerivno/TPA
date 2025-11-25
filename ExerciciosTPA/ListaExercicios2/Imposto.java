package execicios1;

import java.util.Scanner;

public class Imposto {
	public static void main (String args[] ) {
	    
		Scanner in = new Scanner(System.in);
		
		double salario, ir, parcela, imposto;
		
		System.out.println("digite seu salário: ");
		salario = in.nextDouble();
		
		if (salario <= 1434.59) {
			ir = 0;
			parcela = 0;
		} else if (salario >= 1434.60 && salario < 2150.00){
			ir = 7.5;
			parcela = 107.59;
		} else if ( salario >= 2150.01 && salario < 2866.70){
			ir = 15;
			parcela = 268.84;
		} else if (salario >=  2866.71 && salario < 3582.00) {
			ir = 22.5;
			parcela = 483.84;
		} else {
			ir = 27.5;
			parcela = 662.91;
		}
		
		imposto = (salario*ir/100)-parcela;
		System.out.println("IRPF "+ imposto);
		
	}
}

package execicios1;

import java.util.Scanner;

public class Idade2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int anoAtual, anoNasc, idade;
		
		System.out.println("Digite o ano atual:");
		anoAtual = in.nextInt();
		
		System.out.println("Digite o ano de nascimento:");
		anoNasc = in.nextInt();
		
		idade = anoAtual-anoNasc;
		
		System.out.println("Sua idade : "+idade);
		
		if(idade<10) {
			System.out.println("Criança");
		}
		
		else if(idade<18) {
			System.out.println("Adolescente");
		}
		
		else if(idade<60) {
			System.out.println("Adulto");
		}
		
		else {
			System.out.println("Idoso");
		}


	}
}

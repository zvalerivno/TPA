package execicios1;

import java.util.Scanner;

public class Idade3 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		int id,i = 1;
		
		
		do {
			
			System.out.println("Digite a idade:");
			id = in.nextInt();
			
			if(id <= 15) {
				System.out.println("1º Faixa");
			}
			
			else if(id <= 30) {
				System.out.println("2º Faixa");
			}
			
			else if(id <= 45) {
				System.out.println("3º Faixa");
			}
			
			else if(id <= 60) {
				System.out.println("4º Faixa");
			}
			
			else {
				System.out.println("5º Faixa");
			}
			
			i++;
			
			System.out.println("Deseja continuar? (1 - Sim / 2 - Não): ");
			i = in.nextInt();
			
		}while(i == 1);
		
		
		
		
		
		

	}

}

package execicios1;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double n1, n2, media, novaMedia, exame;
		
		System.out.println("Digite a primeira nota:");
		n1 = in.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		n2 = in.nextDouble();
		
		media = (n1 + n2) / 2;
		
		System.out.println("Média:"+media);
		
		
		if(media < 3) {
			System.out.println("O aluno est� Reprovado");
		}
		
		else if(media >= 6) {
			System.out.println("O aluno está Aprovado");		
			}
		
		else {
			System.out.println("O aluno está em Exame");
			
			System.out.println("Digite a nota do exame:");
			exame = in.nextDouble();
			novaMedia = (media + exame) / 2;
			System.out.println("Nova media: "+novaMedia);
			
			if(novaMedia >= 6){
				System.out.println("O aluno está Aprovado");
			}
			
			else{
				System.out.println("O aluno reprovado");
			}
		}
		
		
		
		
	}
}

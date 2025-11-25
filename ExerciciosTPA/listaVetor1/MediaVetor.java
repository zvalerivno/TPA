package execicios1;

import java.util.Scanner;

public class MediaVetor {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;

		int a[], i,soma = 0;
		double media;
		
		a = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A:");
			a[i] = in.nextInt();
			
			soma += a[i] ;
			
		}
		
		media = soma/TAM;
		
		System.out.println("A media dos números é: "+media);

	}

}

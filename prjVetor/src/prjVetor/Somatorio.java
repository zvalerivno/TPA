package prjVetor;

import java.util.Scanner;

public class Somatorio {
	public static void main(String[] args) {
		
		
		Scanner in  = new Scanner (System.in);
		
		final int TAM=2;
		int a[],b[],m,soma,i;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i <TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor  A:");
			a[i] = in.nextInt();
			
		}
		
	    for (i = 0; i < TAM; i++) {
            soma = 0;

            for (m= i; m < TAM; m++) {
                soma += a[m];
            }

            b[i] = soma;
        }

   
        for (i = 0; i < TAM; i++) {
            System.out.println("B = " + b[i]);
        }
        
        
	}
}

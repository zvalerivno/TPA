package execicios1;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int anoInicial, qtdAnos=0, anoFinal,bissexto = 0,i;
		
		System.out.println("Digite o ano inicial:");
		anoInicial = in.nextInt();
		
		System.out.println("Digite o ano final:");
		anoFinal = in.nextInt();
		
		i = anoInicial;
		
		while(i<=anoFinal) {
			
			
			if(i%4==0) {
				bissexto = i;
				System.out.println(bissexto);
				qtdAnos++;
			}	
		
			i++;
			
		}
		
		System.out.println("Quantidade de anos bissextos: "+qtdAnos);
		
	}
}

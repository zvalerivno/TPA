package execicios1;

import java.util.Scanner;

public class Tabuada2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i = 1, n, r;
		
		System.out.println("Digite um número inteiro:");
		n = in.nextInt();
		
		while(i<=200) {
			
			r = n*i;
			
			System.out.println(+n+"x"+i+"="+r);
			
			i++;
		
		}

	}

}

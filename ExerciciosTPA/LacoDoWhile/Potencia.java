package execicios1;
import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		int n, e,p = 1,i = 1;
		
		
		System.out.println("Digite o número:");
		n = in.nextInt();
		
		System.out.println("Digite o expoente:");
		e = in.nextInt();
		
		
		do {
			
		   p = p*n;
		   
		   i++;
			
		   
		   
		}while(i <= e);
		
		System.out.println("A potência de "+n+" elevado a "+e+" é: "+p);
		
		
	}	
}

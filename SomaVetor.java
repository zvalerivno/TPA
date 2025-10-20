import java.util.Scanner;

public class SomaVetor {
	public static void main(String[] args) {
		
			Scanner in = new Scanner (System.in);
			final int TAM=2;
			int a[],b[],c[],i;
			a = new int [TAM];
			b = new int [TAM];
			c = new int [TAM];
		
			for(i=0; i <TAM;i++) {
			System.out.println("Digite o "+(i+1)+" valor de A:");
			a[i] = in.nextInt();
			
			}
		
			for(i=0; i <TAM;i++) {
			System.out.println("Digite o "+(i+1)+" valor de B:");
			b[i] = in.nextInt();
			
			c[i] = b[i]+a[i];
			}
		
			System.out.println("\nA = ");
			for(i=0; i <TAM;i++) {
			System.out.println(a[i] +" ");
			
			
			System.out.println("\nB = ");
			for(i=0; i <TAM;i++) {
			System.out.println(b[i] +" ");
			
			
			
			System.out.println("\nC = ");
			for(i=0; i <TAM;i++) {
			System.out.println(c[i] +" ");
				
			
			
			
			
			
			}
		}
	  }
	}
}

package execicios1;

import java.util.Scanner;

public class Teste {
	public static void main (String args [] ) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		
		
		System.out.println("Digite o valor A:");
		a = in.nextInt();
		
		System.out.println("Digite o valor B:");
		b = in.nextInt();
		
		System.out.println("Digite o valor C:");
		c = in.nextInt();
		
		if (a <= b) {
	        if (b <= c) {
	            System.out.println(a);
	            System.out.println(b);
	            System.out.println(c);
	            
	        } else if (a <= c) {	               
	                System.out.println(a);
	                System.out.println(c);
	                System.out.println(b);
	                
	            } else {	               
	                System.out.println(c);
	                System.out.println(a);
	                System.out.println(b);
	            }
	        }
	     	else if (a <= c) {
	            
	            System.out.println(b);
	            System.out.println(a);
	            System.out.println(c);
	            
	        } else if (b <= c) {
	                
	                System.out.println(b);
	                System.out.println(c);
	                System.out.println(a);
	                
	            } else {
	                
	                System.out.println(c);
	                System.out.println(b);
	                System.out.println(a);
	            }
	            		
     }
}

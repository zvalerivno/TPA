package execicios1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a  = 1,b = 1,n, pro,i = 1;
		
		
		
		System.out.println("Digite o número de termos:");
		n = in.nextInt();
		
		System.out.print(a + " " + b + " ");
		
		do {
            pro = a + b;
            System.out.print(pro + " ");

            a = b;
            b = pro;
            i++;
        } while (i < n);

	}

}

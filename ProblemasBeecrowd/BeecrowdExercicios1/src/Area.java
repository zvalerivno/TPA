import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double area,raio,n;
		
		n = 3.14159;
		
		raio = in.nextDouble();
		
		area = n*(raio*raio);
		
		System.out.println("A="+area);
	
	}
}

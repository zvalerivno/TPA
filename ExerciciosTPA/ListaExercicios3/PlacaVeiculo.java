package execicios1;
import java.util.Scanner;
public class PlacaVeiculo {
	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o último número da placa do veículo:");
		numero = in.nextInt();
		
		switch(numero) {
			case 1:
			case 2:
				System.out.println("Năo pode circular na segunda-feira");
			break;
			case 3:
			case 4:
				System.out.println("Năo pode circular na terça-feira");
			break;
			case 5:
			case 6:
				System.out.println("Năo pode circular na quarta-feira");
			break;
			case 7:
			case 8:
				System.out.println("Năo pode circular na quinta-feira");
			break;
			case 9:
			case 0:
				System.out.println("Năo pode circular na sexta-feira");
			default:
				System.out.println("Placa inválida");
			
		}
		

	}
}

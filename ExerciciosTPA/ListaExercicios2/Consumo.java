package execicios1;

import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double distancia, capacidade, consumo;
		
		System.out.println("Digite a distância  percorrida em Km:");
		distancia = in.nextDouble();
		
		System.out.println("Digite a capacidade do tanque em litros:");
		capacidade = in.nextDouble();
		
		consumo = distancia / capacidade;
		
		System.out.println("O consumo do seu carro: "+consumo);
		
		if(consumo >= 10) {
			System.out.println("Econômico");
		}
		
		else {
			System.out.println("N�o econ�mico");
		}


	}
}

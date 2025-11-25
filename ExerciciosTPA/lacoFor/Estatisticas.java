package execicios1;

import java.util.Scanner;

public class Estatisticas {
	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);

        int maior50 = 0,qtd10e20 = 0,somaAlturas = 0,pesoMenor40 = 0,maisVelho = 0, maisNovo = 200; 
        double mediaAlturas = 0, porcentagemPeso = 0;

        for (int i = 1; i <= 25; i++) { 
        	
            System.out.println("\nPessoa " + i + ":");
            
            System.out.print("Idade: ");
            int idade = in.nextInt();
            
            System.out.print("Altura: ");
            double altura = in.nextDouble();
            
            System.out.print("Peso: ");
            double peso = in.nextDouble();


            if (idade > 50) {
                maior50++;
            }

            else if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                qtd10e20++;
            }

            if (peso < 40) {
                pesoMenor40++;
            }

            if (idade > maisVelho) {
                maisVelho = idade;
            }
            
            if (idade < maisNovo) {
                maisNovo = idade;
            }
            
        }


        if (qtd10e20 > 0) {
            mediaAlturas = somaAlturas / qtd10e20;
        }
        
        porcentagemPeso = (pesoMenor40 * 100) / 25;

        System.out.println("RESULTADOS: ");
        System.out.println("Quantidade de pessoas com idade maior que 50: " + maior50);
        System.out.println("Média alturas de 10 a 20 anos: " + mediaAlturas);
        System.out.println("Porcentagem de pessoas com o peso menor que 40: " + porcentagemPeso + "%");
        System.out.println("Mais velho: " + maisVelho);
        System.out.println("Mais novo: " + maisNovo);
    }
}

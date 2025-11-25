package execicios1;

public class Altura {
	public static void main(String[] args) {
		
		double alturaJoao = 134, alturaPedro = 145;
		int i = 1;
		
		do {
			
			alturaJoao= alturaJoao + 2.5;
			
			 alturaPedro  =  alturaPedro  + 2;
			
			i++;
			
		}while(alturaJoao<alturaPedro);
		
		System.out.println("João irá demorar "+i+"  anos para ficar maior que Pedro");
	}

}

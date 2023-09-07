package lista02;

import java.util.Scanner;

public class quest5 {

	public static void main(String[] args) {
		

		Scanner n = new Scanner(System.in);
		float n1;
		float n2;
		float media;
			
		System.out.println("Digite a nota da sua primeira avaliação: ");
		n1 = n.nextFloat();
		
		while (n1 < 0 || n1 > 10) {
			
			System.out.println("Nota inválida, digite outro número entre 0 e 10: ");
			n1 = n.nextFloat();
		
		}
		
		System.out.println("Digite a nota da sua segunda avaliação: ");
		n2 = n.nextFloat();
		
		while (n2 < 0 || n2 > 10) {
			
			System.out.println("Nota inválida, digite outro número entre 0 e 10: ");
			n2 = n.nextFloat();
		
		}
		media = (n1 + n2) / 2;
		
		System.out.println("Sua media é: " + media);
		
		
		n.close();
		
	}

}

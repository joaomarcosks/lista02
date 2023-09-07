package lista02;

import java.util.Scanner;

public class quest3 {

	public static void main(String[] args) {
		
		Scanner v = new Scanner(System.in);
		float num1;
		float num2;
		
		
		
		System.out.println("Digite um numero: ");
		num1 = v.nextFloat();
		
		System.out.println("Digite outro numero: ");
		num2 = v.nextFloat();
		
		while (num2 == 0) {
			
			System.out.println("VALOR INVÁLIDO");
			System.out.println("Digite outro número diferente de zero: ");
			num2 = v.nextFloat();
			
		}
		float resultado = num1 / num2;
		
		System.out.println("O resultado é: " + resultado);
		
		
		v.close();

	}

}

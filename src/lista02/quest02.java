package lista02;

import java.util.Scanner;

public class quest02 {

	public static void main(String[] args) {
		
		   Scanner i = new Scanner(System.in);
	        float num1;
	        float num2;

	        System.out.println("Digite o primeiro valor: ");
	        num1 = i.nextFloat();

	        do {
	            System.out.println("Digite outro valor: ");
	            num2 = i.nextFloat();
	            
	        } while (num2 == 0);
	            float res = num1 / num2;
	            System.out.println(res);
	            
	        i.close();
	            

	}

}

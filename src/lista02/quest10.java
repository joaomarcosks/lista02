package lista02;

import java.util.Scanner;

public class quest10 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		int N;
		
		System.out.println("Digite um número: ");
		N = a.nextInt();
		
		for (int n = 1 ; n <= N; n++) {
			System.out.println(n);
		}

		a.close();
	}

}

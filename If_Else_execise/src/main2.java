//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x;
		
		System.out.println("Digite um valor:");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			
			System.out.println("Número par");
			
		}
		
		else if(x % 2 != 0) {
			System.out.println("Número ímpar");
		}

		
		sc.close();
	}

}


//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio da figura:");
		
		double pi = 3.14;
		double r;
		
		r = sc.nextDouble();
		
		double a = r*(pi*pi);
		
		System.out.println("A área é:");
		System.out.printf("A= %.4f%n", a);
		
		sc.close();
				
	}
}



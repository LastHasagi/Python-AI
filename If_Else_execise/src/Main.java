import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um valor:");
		x = sc.nextInt();
		
		if(x > 0) {
			System.out.println("Número positivo");
		}
		
		else if(x < 0) {
			System.out.println("Número negativo");
		}
		
		sc.close();
	}
}

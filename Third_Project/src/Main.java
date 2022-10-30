import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("DIGITE DOIS VALORES:");
		
		x = sc.nextInt();
		y = sc.nextInt();
		sc.nextLine(); //tem que ter um Scanner antes para consumir a quebra da linha
		
		
		var z = x + y;
		
		System.out.println("Valores digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println("");
		System.out.println("Resultado da soma:");
		System.out.println(z);
		
		
		sc.close();

	}
	
}
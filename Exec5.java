import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago


public class Exec5 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int c1, c2, qte1, qte2;
		double val1, val2, pag;
		
		System.out.println("Informe o código do produto.");
		c1 = sc.nextInt();
		System.out.println("Informe a quantidade deste produto.");
		qte1 = sc.nextInt();
		System.out.println("Informe o valor deste produto.");
		val1 = sc.nextDouble();
		
		System.out.println("Informe o código do produto.");
		c2 = sc.nextInt();
		System.out.println("Informe a quantidade deste produto.");
		qte2 = sc.nextInt();
		System.out.println("Informe o valor deste produto.");
		val2 = sc.nextDouble();
		
		pag = qte1 * val1 + qte2 * val2;
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Você está comprando " + qte1 + " unidades de " + c1 + " e " + qte2 + " unidades de " + c2);
		System.out.printf("Valor a pagar: RS" + "%.2f%n", pag);
		
		
		
		
		sc.close();
		
		
	}

}

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais


public class Exec4 {

	public static void main(String[] args) {
		
				
		Scanner sc = new Scanner(System.in);

		int n; // número do funcionário;
		double h; //horas trabalhadas;
		double r; //remuneração;
		double s; // salário a ser calculado
		
		
		System.out.println("Digite o número de cadastro do funcionário:");
		n = sc.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas pelo funcionário:");
		h = sc.nextDouble();
		
		System.out.println("Digite o valor da hora trabalhada:");
		r = sc.nextDouble();
		
		s = (double) h * r;		
		
		Locale.setDefault(Locale.US);
		System.out.printf("O valor da remuneração do funcionário " + n + " é de: R$ " + "%.2f%n", s);
		
		

		sc.close();
		
	}

}

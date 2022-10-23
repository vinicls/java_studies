import java.util.Locale;
import java.util.Scanner;

public class Exec6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double triangulo, circulo, trapezio, quadrado, retangulo;		
		
		System.out.println("Insira o valor de A.");
		A = sc.nextDouble();
		System.out.println("Insira o valor de B.");
		B = sc.nextDouble();
		System.out.println("Insira o valor de C.");
		C = sc.nextDouble();
		
		triangulo = A * C / 2;
		
		circulo = 3.14159 * Math.pow(C,  2);
		
		trapezio = (A + B) * C / 2;
		
		quadrado = Math.pow(B,  2);
		
		retangulo = A * B;
		
		Locale.setDefault(Locale.US);

		System.out.println();
		System.out.printf("TRIÂNGULO: " + "%.3f%n", triangulo);
		System.out.println();
		System.out.printf("CÍRCULO: " + "%.3f%n", circulo);
		System.out.println();
		System.out.printf("TRAPÉZIO: " + "%.3f%n", trapezio);
		System.out.println();
		System.out.printf("QUADRADO: " + "%.3f%n", quadrado);
		System.out.println();
		System.out.printf("RETÂNGULO: " + "%.3f%n", retangulo);
		
		sc.close();
		
	}

}

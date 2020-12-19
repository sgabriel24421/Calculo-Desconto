import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int valor, desconto;
		double result;
		
		System.out.println("Insira o valor: ");
		valor = s.nextInt();
		
		System.out.println("Insira o valor do desconto: ");
		desconto = s.nextInt();
		
		result = (valor * desconto) / 100;
		
		System.out.println("Você salvou " + result + " reais de desconto\n");
		
		System.out.println("Novo valor que você possui: " + (valor - result));
		
		
		
	}

}

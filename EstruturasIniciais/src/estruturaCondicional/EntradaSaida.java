package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {

		// separador de decimais como ponto
		Locale.setDefault(Locale.US);

		// Criação do objeto sc (Scanner)
		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;
		double salario;
		char letra;
		String nomeCompletoChefe;

		// Para ler uma palavra (texto sem espaços)
		System.out.println("Digite seu nome");
		nome = sc.next();
		System.out.println("Seu nome é: " + nome);

		// Para ler um número inteiro
		System.out.println("Digite sua idade");
		idade = sc.nextInt();
		System.out.println("Sua idade é: " + idade);

		// Para ler um número com ponto flutuante
		System.out.println("Digite seu salário");
		salario = sc.nextDouble();
		System.out.println("Seu salário é: " + salario);

		// Para ler um caractere
		System.out.println("Digite sua letra");
		letra = sc.next().charAt(0);
		System.out.println("Sua letra é: " + letra);

		// Para ler vários dados na mesma linha, (NextLine extra é para consumir o
		// espaço)
		System.out.println("Digite o nome completo do chefe");
		sc.nextLine();
		nomeCompletoChefe = sc.nextLine();
		System.out.println("Seu chefe é: " + nomeCompletoChefe);

		// usado quando não precisar mais do objeto sc
		sc.close();
	}

}

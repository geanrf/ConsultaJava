package estruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class EnquantoPositivo {

    public static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int numero = sc.nextInt();
        int soma = 0;

        while (numero >= 0) {

            soma += numero;
            System.out.println("Digite um número");
            numero = sc.nextInt();

        }

        System.out.println("Soma dos números: " + soma);

        // usado quando não precisar mais do objeto sc
        sc.close();

    }

}

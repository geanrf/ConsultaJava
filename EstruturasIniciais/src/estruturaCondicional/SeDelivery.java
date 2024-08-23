package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class SeDelivery {

    public static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        double codigo, quantidade, conta;
        double cQ = 4, xS = 4.5, xB = 5, tS = 2, refri = 1.5;

        System.out.println("Digite o código do produto");
        codigo = sc.nextInt();

        if (codigo == 1) {

            System.out.println("Quantos cachorros Quente você deseja? ");
            quantidade = sc.nextInt();
            conta = cQ * quantidade;
            System.out.println("Total: R$ " + conta);

        } else if (codigo == 2) {

            System.out.println("Quantos X-Salada você deseja? ");
            quantidade = sc.nextInt();
            conta = xS * quantidade;
            System.out.println("Total: R$ " + conta);

        }

        else if (codigo == 3) {

            System.out.println("Quantos X-Bacon você deseja? ");
            quantidade = sc.nextInt();
            conta = xB * quantidade;
            System.out.println("Total: R$ " + conta);

        }

        else if (codigo == 4) {

            System.out.println("Quantos Torrada Simples você deseja? ");
            quantidade = sc.nextInt();
            conta = tS * quantidade;
            System.out.println("Total: R$ " + conta);

        }

        else if (codigo == 5) {

            System.out.println("Quantos Refrigerantes você deseja? ");
            quantidade = sc.nextInt();
            conta = refri * quantidade;
            System.out.println("Total: R$ " + conta);

        }

        else {
            System.out.println("Código Invalido");
        }

        

        // usado quando não precisar mais do objeto sc
        sc.close();

    }

}

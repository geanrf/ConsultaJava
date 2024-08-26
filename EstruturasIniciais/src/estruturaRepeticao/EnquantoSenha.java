package estruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class EnquantoSenha {

    public static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha");

        int senha = sc.nextInt();

        /*
         * É uma
         * estrutura de
         * controle que
         * repete um
         * bloco de
         * comandos enquanto
         * uma condição for
         * verdadeira.
         * Quando usar:
         * quando não
         * se sabe
         * previamente a
         * quantidade de
         * repetições que
         * será realizada.
         */

        while (senha != 123456) {

            System.out.println("Senha Invalida");
            senha = sc.nextInt();

        }

        System.out.println("Acesso Permitido");

        // usado quando não precisar mais do objeto sc
        sc.close();

    }

}

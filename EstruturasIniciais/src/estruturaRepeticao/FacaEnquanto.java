package estruturaRepeticao;

import java.util.*;

public class FacaEnquanto {

    public static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        int num, soma = 0;

        /*
         * É uma declaração de fluxo de controle que executa um bloco de código e então
         * repete o bloco ou sai do loop dependendo de uma dada condição booleana
         */
        do {

            System.out.println("Digite um número");

            num = sc.nextInt();
            if (num >= 0) {
                soma += num;
            }

        } while (num >= 0);

        System.out.println("Soma dos números positivos: " + soma);

        sc.close();
    }

}

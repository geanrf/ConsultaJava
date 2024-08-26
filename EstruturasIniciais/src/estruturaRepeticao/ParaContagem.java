package estruturaRepeticao;

import java.util.*;

public class ParaContagem {

    public static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        System.out.println("TesteClass");

        /*
         * É uma
         * estrutura de
         * controlde que
         * repete um
         * bloco de
         * comandos para
         * um certo
         * intervalo de
         * valores. Usar quando
         * se sabe
         * previamente a
         * quantidade de repetições,
         * ou o
         * intervalo de valores.
         */
        for (int i = 0; i < 10; i++) {

            System.out.println("Quase lá");

        }

        for (int i = 0; i < 100; i++) {

            int soma = i + 1;
            System.out.println("Resultado: " + i);

        }

        sc.close();
    }

}

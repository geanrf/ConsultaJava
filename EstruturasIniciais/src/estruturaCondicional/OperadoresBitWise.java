package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresBitWise {

    public static void main(String[] args) {

        /*
         * * Camel case: lastName. Para pacotes, atributos, métodos, variáveis e
         * parâmetros.
         * Pascal Case: NameClasse
         */

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        // usado quando não precisar mais do objeto sc
        sc.close();
    }

}

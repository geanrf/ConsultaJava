package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class TrocarCaso {

    public static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        int diaSemana;

        System.out.println("Digite o dia da semana");
        diaSemana = sc.nextInt();

        /*
         * Quando se tem várias opções de fluxo a serem tratadas com base no valor de
         * uma variável.
         */
        switch (diaSemana) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.err.println("Dia InválidoS");
                break;
        }

        // usado quando não precisar mais do objeto sc
        sc.close();

    }

}

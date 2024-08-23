package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class SeHorario {

    public static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        // String nome;
        int horario;
        // double salario;
        // char letra;

        System.out.println("Digite um horario");
        horario = sc.nextInt();

        if (horario < 12) {

            System.out.println("Bom Dia !");

        } else if (horario < 18) {

            System.out.println("Boa Tarde !");
        } else
            System.out.println("Boa Noite !");

        // usado quando não precisar mais do objeto sc
        sc.close();

    }

}

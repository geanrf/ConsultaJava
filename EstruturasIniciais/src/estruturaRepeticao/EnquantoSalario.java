package estruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class EnquantoSalario {

    public static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário");

        int salario = sc.nextInt();

        while (salario < 3000) {

            System.out.println("Junior");
            salario += 1;

        }

        System.out.println("Pleno");

        // usado quando não precisar mais do objeto sc
        sc.close();

    }

}

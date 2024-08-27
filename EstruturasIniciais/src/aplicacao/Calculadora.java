package aplicacao;

import java.util.*;

import entidades.*;

public class Calculadora {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Insira a altura e a largura do retangulo");

        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.println(" ÁREA: " + retangulo.area());
        System.out.println(" PERIMETRO: " + retangulo.perimetro());
        System.out.println(" DIAGONAL: " + retangulo.diagonal());

        sc.close();

    }

}

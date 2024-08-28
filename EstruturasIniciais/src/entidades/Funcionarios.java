package entidades;

public class Funcionarios {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {

        this.salarioBruto += salarioBruto * porcentagem / 100.0;

    }

    public String toString() {

        return nome + ", R$" + String.format("%.2f", salarioLiquido());
    }

}

package entidades;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalValorEstoque() {

        return preco * quantidade;
    }

    public void adicionaProdutos(int quantidade) {

        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade) {

        this.quantidade -= quantidade;

    }

    /*
     * É um método herdado da classe base 'object', que é a superclasse de todas as
     * classes em java. Tem como objetivo fornecer uma representação em formato de
     * texto (ou string) de um objeto.
     */
    public String toString() {
        return nome
                + ", R$ "
                + preco
                + ", "
                + quantidade
                + " unidade, Total: R$ "
                + totalValorEstoque();

    }

}

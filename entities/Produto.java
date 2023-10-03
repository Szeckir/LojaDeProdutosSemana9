package entities;

public abstract class Produto {
    private String nome;
    protected int quantidade;
    protected double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }

    public abstract double calculaValorImposto();
    public abstract String geraDescricao();
}

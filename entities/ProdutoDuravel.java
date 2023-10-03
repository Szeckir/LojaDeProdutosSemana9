package entities;

public class ProdutoDuravel extends Produto{
    private String material;

    public ProdutoDuravel(String nome, int quantidade, double preco, String material) {
        super(nome, quantidade, preco);
        this.material = material;
    }

    @Override
    public double calculaValorImposto() {
        if (this.quantidade >= 1000) {
            return this.preco + ((this.preco * 150)/100);
        } else {
            return this.preco + ((this.preco * 25) / 100);
        }
    }

    @Override
    public String geraDescricao() {
        return this.material;
    }
}

package entities;

public class Perecivel extends Produto{
    private int prazoValidade;

    public Perecivel(String nome, int quantidade, double preco, int prazoValidade) {
        super(nome, quantidade, preco);
        this.prazoValidade = prazoValidade;
    }

    @Override
    public double calculaValorImposto() {
        if (this.prazoValidade <= 7) {
            return this.preco + ((this.preco * 5) / 100);
        } else {
            return this.preco + ((this.preco * 10) / 100);
        }
    }

    @Override
    public String geraDescricao() {
        return this.prazoValidade;
    }
}

package main;

import entities.Estoque;
import entities.Perecivel;
import entities.Produto;
import entities.ProdutoDuravel;

public class Main {
    public static void main(String[] args) {
        Produto perecivel = new Perecivel("Banana", 10, 5, 8);
        Produto duravel = new ProdutoDuravel("Waffer", 11, 7, "Plastico");

        System.out.println(duravel.calculaValorImposto());
        System.out.println(perecivel.calculaValorImposto());

        System.out.println(duravel.geraDescricao());
        //System.out.println(perecivel.geraDescricao());



        Estoque estoquePereciveis = new Estoque();
        Estoque estoqueDuraveis = new Estoque();

        estoquePereciveis.adicionaProduto(perecivel);
        estoqueDuraveis.adicionaProduto(duravel);
        estoqueDuraveis.adicionaProduto(new ProdutoDuravel("bolacha", 10, 300, "ferro"));
        estoqueDuraveis.adicionaProduto(new ProdutoDuravel("yogurt", 17, 290, "comida"));
        estoqueDuraveis.adicionaProduto(new ProdutoDuravel("bolo", 30, 10, "pc"));
        estoqueDuraveis.adicionaProduto(new ProdutoDuravel("bala", 20, 400, "teste"));
        estoqueDuraveis.adicionaProduto(new ProdutoDuravel("biscoito", 22, 20, "ferro"));

        System.out.println(estoqueDuraveis.geraResumo());
        
    }
}
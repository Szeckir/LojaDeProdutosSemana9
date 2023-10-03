package entities;

import java.util.ArrayList;

public class Estoque {
    ArrayList todosProdutos = new ArrayList<>();

    public boolean adicionaProduto(Produto produto) {
        todosProdutos.add(produto);
        return true;
    }

    public String geraResumo() {
        if (todosProdutos.size() != 0) {
            for (int i = 0; i < todosProdutos.size(); i++) {
                System.out.println( "Nome: " + todosProdutos.get(i));
            }
            return "finalizado.";
        } 
        return null;
    }

    @Override
    public String toString() {
        return "Estoque [todosProdutos=" + todosProdutos + "]";
    }
}

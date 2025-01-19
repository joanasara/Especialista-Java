package construtores;

import java.util.Objects;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    String nome;
    int quantidadeEstoque;

    Produto(String nome) {
        Objects.requireNonNull(nome, "Nome e obrigatorio");
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome e obrigatorio");
        if (estoqueInicial < 0 ){
            throw  new IllegalArgumentException("Estoque inicial nao pode ser negativo");
        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
    }

    Produto() {
        this.nome = "Sem nome";
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }


}

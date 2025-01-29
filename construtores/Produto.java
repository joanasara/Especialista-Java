package construtores;

import java.util.Objects;
import java.util.UUID;

public class Produto {

    private static final int QUANTIDADE_ESTOQUE_INICIAL = 100;
    private final String codigo;
    private String nome;
    private  int quantidadeEstoque;

    Produto() {
        this("Sem nome"); //ESTA CHAMANDO OUTRO CONSTRUTOR
        System.out.println("Teste");
    }


    Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    private Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome e obrigatorio");
        if (estoqueInicial < 0 ){
            throw  new IllegalArgumentException("Estoque inicial nao pode ser negativo");
        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = UUID.randomUUID().toString();
    }
}

package construtores;

public class TesteProdutoMain {
    public static void main(String[] args) {

        Produto produtos = new Produto("Picanha quilo (peca)");
        Produto produto2 = new Produto("Rice", 40);
        Produto produto3 = new Produto();

        System.out.println(produtos.codigo);
        System.out.println(produtos.nome);
        System.out.println(produto2.quantidadeEstoque);

        System.out.println("-------------------------------------");

        System.out.println(produto2.codigo);
        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);

        System.out.println("-------------------------------------");

        System.out.println(produto3.codigo);
        System.out.println(produto3.quantidadeEstoque);
        System.out.println(produto3.nome);
    }
}

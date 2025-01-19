package arrays;

import java.util.ArrayList;

public class Cardapio {

    ArrayList<ItemCardapio>  itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    void removerItem(int indice) {
       itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

    ArrayList<ItemCardapio> consultarPorPreco(double precoMaximo, double precoMinimo){
        ArrayList<ItemCardapio> itensEncontrados = new ArrayList<>();

        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(item.preco, precoMaximo)) {
                itensEncontrados.add(item);
            }
        }
        return itensEncontrados;
    }
}

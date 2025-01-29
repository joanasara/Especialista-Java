package construtores;

import java.util.Objects;

public class ParticipanteAlgaMilhas {

    private String nome;
    private int saldoDePontos;

    public ParticipanteAlgaMilhas(String nome) {
        this.nome = nome;
    }

    private ParticipanteAlgaMilhas(String nome, int saldoDePontosIcial) {
        Objects.requireNonNull(nome, "Nome e obrigatorio");

        if (saldoDePontosIcial < 0) {
            throw new IllegalArgumentException("Saldo inicial de pontos nao pode ser negativos");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontosIcial;
    }

    public void creditarPontos(int pontos) {
        if (pontos < 0){
            throw new IllegalArgumentException("Pontos nao pode ser negativo");
        }
        this.saldoDePontos += pontos;
    }
}

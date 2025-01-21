package construtores;

public class Participante {

    String nome;
    int saldoDePontos;

    Participante(String nome) {
        this.nome = nome;
    }

    Participante(String nome, int saldoDePontosInicial) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }
}

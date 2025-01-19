package construtores;

public class ParticipanteMain {
    public static void main(String[] args) {
        Participante participan01 = new Participante("Joana leite");
        Participante participante02 = new Participante("maria dolores", 56);

        System.out.println(participan01.nome);
        System.out.println("-----------------------------");
        System.out.println(participante02.nome);
        System.out.println(participante02.saldoDePontos);



    }
}

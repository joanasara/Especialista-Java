package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class InicializandoArray {
    public static void main(String[] args) {
        //ArraysList nao suporta tipo primitivo, so do tipo wrappers

        int[] valorFinal = new int[]{10,11,45,23,78,12,12,89};
        double media = Calculadora.calculadora(valorFinal);

        Integer[] valor = {10,11,45,23,78,12,89};
        Arrays.sort(valor, Comparator.reverseOrder());


        Turma turmaB = new Turma();
        turmaB.identificacao = "Maria";
        turmaB.nomeProfessor = "Fatima";

        Aluno aluno01 = new Aluno();
        aluno01.nome = "Laura";
        aluno01.idade = 12;

        turmaB.imprimirAlunos();
        turmaB.adicionarAluno(aluno01);
        turmaB.imprimirAlunos();

        /*
        for (int i = 0; i < turmaB.alunos.length; i++) {
            Aluno alunos = turmaB.alunos[i];
            if (alunos != null) {
                System.out.printf("%d - %s (%d anos)%n", i, turmaB.alunos[i].nome, turmaB.alunos[i].idade);
            } else {
                System.out.printf("%d - vago%n", i);
            }
        }
*/

    }

}

package arrays;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("maria");
        alunos.add("Joao");
        alunos.add("Sara");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

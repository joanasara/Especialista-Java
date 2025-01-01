package arrays;
import java.util.Arrays;

public class RemovendoElementoArray {
    public static void main(String[] args) {
        //nao podemos remover uma posicao de uma Array, oque pode ser feito e criar outro array com menos posicao.
        int[] numerosJogoAtual = {25,11,8,46,37,14,55};
        int[] numeroNovoJogo = new int[numerosJogoAtual.length - 1];

        int indiceExclusao = 2;

        System.arraycopy(numerosJogoAtual, 0, numeroNovoJogo, 0, indiceExclusao);
        System.arraycopy(numerosJogoAtual,indiceExclusao + 1, numeroNovoJogo,indiceExclusao,numeroNovoJogo.length - indiceExclusao);

        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numeroNovoJogo));


    }
}

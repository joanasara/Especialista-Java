package arrays;

public class Calculadora {

    static double calculadora(int[] numeros) {
        int total = 0;

        for (int i=0; i<numeros.length; i++) {
            total += numeros[i];
            //AQUI E MAIS FACIL TRABALHAR COM INDICE
        }

        for (int number : numeros) {
            total += number;
            //ESE AQUI E PARA QUANDO NAO VAI PRECISAR USAR O INDICE
        }

        return (double) total / numeros.length;
    }



}

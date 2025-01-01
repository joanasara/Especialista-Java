package arrays;

import java.util.Scanner;

public class TesteSelecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);

        boolean cond1 = B > C;
        boolean cond2 = D > A;
        boolean cond3 = (C + D) > (A + B);
        boolean cond4 = C > 0 && D > 0;
        boolean cond5 = A % 2 == 0;


        // Resultado
        if (cond1 && cond2 && cond3 && cond4 && cond5) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }


        sc.close();
    }
}

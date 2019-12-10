package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int i, j, cont = 00, op, l, c, x;
        ;
        int jogo[][] = new int[3][3];
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                cont = cont + 01;
                jogo[i][j] = cont;

            }
        }
        System.out.println("================");
        System.out.println("  JOGO DA VELHA");
        System.out.println("+----+----+----+");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("|  ");
                System.out.print(jogo[i][j] + " ");

            }
            System.out.print("");
            System.out.println("|");
            System.out.println("+----+----+----+");

        }
        System.out.println("================");
        System.out.println("Digite um numero para 1: ");
        op = key.nextInt();
        if (op > 0 && op < 10) {

        } else {
            System.out.println("Opcao Invalida");
        }
        if (op > 0 && op < 4) {
            l = 1;
        } else if (op > 3 && op < 7) {
            l = 2;
        } else {
            l = 3;
        }
        System.out.println(x = 1);
        System.out.println("Digite um numero para " + cont + ": ");
        op = key.nextInt();
        if (op > 0 && op < 10) {
            if (op > 0 && op < 4) {
                l = 1;
                jogo[l][op] = x;
            } else if (op > 3 && op < 7) {
                l = 2;
                jogo[l][op - 3] = x;
            } else {
                l = 3;
                jogo[l][op - 6] = x;
            }
        } else {
            System.out.println("Opcao Invalida");
        }
    }
}

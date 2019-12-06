package provaexe03;

import java.util.Scanner;

public class ProvaExe03 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String nomeAluno[] = new String[3];
        double notaAluno[] = new double[3];
        int leia;
        System.out.println("Digite a Opção Desejada:");
        System.out.println("1 - Cadastro de alunos");
        System.out.println("2 - Informacoes de alunos");
        System.out.println("3 - Modificar nota");
        System.out.println("4 - Media de notas");
        leia = key.nextInt();
        while (leia == 1) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Digite o nome do " + (i + 1) + "º aluno: ");
                nomeAluno[i] = key.nextLine();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("Digite a nota do aluno: " + nomeAluno[i]);
                notaAluno[i] = key.nextDouble();
            }
        }
        while (leia == 2) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Nome: " + nomeAluno[i] + " Nota: " + notaAluno[i]);
            }
        }
    }
}
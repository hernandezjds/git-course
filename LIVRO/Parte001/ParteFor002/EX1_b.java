package LIVRO.Parte001.ParteFor002;

import java.util.Scanner;

public class EX1_b {
    public static void main(String[] args) {
        int i=0, anoAtual;
        double salario, novoSalario, percentual;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite ano atual.:");
        anoAtual = dados.nextInt();
        salario = 1000;
        percentual = 1.5 /100;
        novoSalario = salario + percentual * salario;
        while (i <= anoAtual)
        {
            percentual = 2 * percentual;
            novoSalario = novoSalario + percentual * novoSalario;
            i = i +1;
        }
        System.out.println("novo salario = "+novoSalario);
    }
}

package LIVRO.Parte001.ParteFor002;

import java.util.Scanner;

public class EX1_A {
    public static void main(String[] args) {
        double salarioInicial, percentual, salarioAtual=0;
        int i,anoAtual;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite ano atual..:");
        anoAtual = dados.nextInt();
        salarioInicial = 1000;
        percentual = 1.5 /100;
        salarioAtual = salarioInicial + percentual * salarioAtual;
        for (i = 2007; i <= anoAtual; i++)
        {
            percentual = 2 * percentual;
            salarioAtual = salarioAtual + percentual * salarioAtual;
        }
        System.out.println("salario  atual..:"+salarioAtual);

    }
}

package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Opcao {
    public static void main(String[] args) {
        double num1, num2, soma, raiz;
        int opcaos;
        Scanner entrada;

        entrada = new Scanner(System.in);
        System.out.println("digite a opção desejada 1 ou 2..: = ");
        opcaos = entrada.nextInt();
        if (opcaos ==1)
        {
            System.out.println("digite o primeiro numero..:");
            num1 = entrada.nextInt();
            System.out.println("digite o segundo numero..:");
            num2 = entrada.nextInt();
            soma = num1 + num2;
            System.out.println("a soma dos dois numero..:"+soma);

        }
        if (opcaos == 2) {
            System.out.println("digite um numero..:");
            num1 = entrada.nextInt();
            raiz = Math.sqrt(num1);
            System.out.println("a raiz quadrada e ..:" + raiz);
        }
        if (opcaos != 1 && opcaos != 2)
            System.out.println("opçao invalida..:");


    }
}


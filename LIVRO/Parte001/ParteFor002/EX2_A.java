package LIVRO.Parte001.ParteFor002;

import java.util.Scanner;

public class EX2_A {
    public static void main(String[] args) {
        int n, i, j;
        float e, fat;
        Scanner dados = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        n = dados.nextInt();
        e=1;
        for (i=1;i<=n;i++)
        {
            fat = 1;
            for (j=1;j<=i;j++)
                fat = fat * j;
            e = e + 1/fat;
        }
        System.out.println("Valor de E = " +e);
    }


    }


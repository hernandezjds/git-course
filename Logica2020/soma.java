package Logica2020;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        int x,y,soma;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite um numero..:");
        x = dados.nextInt();
        System.out.println("digite um numero..:");
        y = dados.nextInt();
        soma = x + y;
        System.out.println("a soma e ..:"+soma);

    }
}

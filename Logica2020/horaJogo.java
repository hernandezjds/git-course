package Logica2020;

import java.util.Scanner;

public class horaJogo {
    public static void main(String[] args) {
        double inicioJogo, fimJogo, duracao;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite o inicio do jogo.:");
        inicioJogo = dados.nextDouble();
        System.out.println("digite o final do jogo.:");
        fimJogo = dados.nextDouble();
        duracao = fimJogo - inicioJogo;
        System.out.println("o jogo durou ..:"+duracao);
    }
}

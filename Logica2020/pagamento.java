package Logica2020;

import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        double valorPorHoras, quantidadeHorasTraba,valorPagamento;
        String nome;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite o nome do funcionario..:");
        nome = dados.next();
        System.out.println("digite valor da horas trabalhadas..:");
        valorPorHoras = dados.nextDouble();
        System.out.println("quantidade de horas trabalhadas no mes..:");
        quantidadeHorasTraba = dados.nextDouble();
        valorPagamento = valorPorHoras * quantidadeHorasTraba;
        System.out.println("nome.:" +nome);
        System.out.println("valor por horas..:" +valorPorHoras);
        System.out.println("horas trabalhadas..:" +quantidadeHorasTraba);
        System.out.println("o pagamento para " +nome+ "deve ser de " +valorPagamento);


    }
}

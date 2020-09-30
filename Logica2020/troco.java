package Logica2020;

import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        double precoUnitario, quantidadeDeProduto, valorDinheiro, trocoDevolvido,valorProduto;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite o preço do produto..:");
        precoUnitario = dados.nextDouble();
        System.out.println("digite a quantidade..:");
        quantidadeDeProduto = dados.nextDouble();
        System.out.println("digite valor em dinheiro..:");
        valorDinheiro = dados.nextDouble();
        valorProduto = precoUnitario * quantidadeDeProduto;
        trocoDevolvido = valorDinheiro - valorProduto;
        System.out.println("o valor da compra e ..:"+valorProduto);
        System.out.println("valor de troco..:"+trocoDevolvido);

    }
}

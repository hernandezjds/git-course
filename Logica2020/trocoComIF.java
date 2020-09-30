package Logica2020;

import java.util.Scanner;

public class trocoComIF {
    public static void main(String[] args) {
        double precoUnitario, resto=0, quantidadeComprada, dinheiroRecebido, troco;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite o preço unitario..:");
        precoUnitario = dados.nextDouble();
        System.out.println("digite a quantidade de produto..:");
        quantidadeComprada = dados.nextDouble();
        System.out.println("digite valor em dinheiro..:");
        dinheiroRecebido = dados.nextDouble();

        if ( dinheiroRecebido >= (precoUnitario * quantidadeComprada) ){
            troco = dinheiroRecebido - precoUnitario * quantidadeComprada;
            System.out.println("valor do troco..:" + troco);

        }
           else
               resto =   precoUnitario * quantidadeComprada - dinheiroRecebido;
                System.out.println("saldo insuficiente falta ..:"+resto+ "reais");

        }
    }


package Logica2020;

import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        double precoUnitario, quantidadeComprada, dinheiroRecebido, troco = 0, valorDaCompra;
        char codigoProduto;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite o codigo do produto 1 2 3 4 5 ..:");
        codigoProduto = dados.next().charAt(0);
        if (codigoProduto == '1') {

        }
        else  if (codigoProduto == '2'){


        }
        else  if (codigoProduto == '3'){


        }
        else  if (codigoProduto == '4'){


        }
        else  if (codigoProduto == '4'){


        }

        System.out.println("digite o preço unitario..:");
        precoUnitario = dados.nextDouble();
        System.out.println("digite a quantidade de produto..:");
        quantidadeComprada = dados.nextDouble();
        System.out.println("digite valor em dinheiro..:");
        dinheiroRecebido = dados.nextDouble();


        valorDaCompra = precoUnitario * quantidadeComprada;

        if (valorDaCompra >= dinheiroRecebido){
            System.out.println("saldo insuficiente");
        }
        else
            System.out.println("valor da compra..:" + valorDaCompra);
            troco = dinheiroRecebido - valorDaCompra;
        System.out.println("valor do troco..:" + troco);



    }

    }


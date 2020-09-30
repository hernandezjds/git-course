package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        double preco, venda, novoPreco =0;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o preço inicial..:");
        preco = entrada.nextDouble();
        System.out.println("digite o de venda>.:");
        venda = entrada.nextDouble();
        if (venda < 500 || preco <30)
            novoPreco = preco + preco * 10/100;
        if ((venda >= 500 && venda < 1200) || (preco >= 30 && preco < 80))
            novoPreco = preco + preco * 15/100;
        if (venda >= 1200 || preco >= 80)
            novoPreco = preco - preco * 15/100;
        System.out.println("novo preço do produto e..:"+novoPreco);


    }
}

package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        int codigo, peso,gramas, imposto, valorTotal, preco = 0;
        Scanner entrada;
        entrada =  new Scanner(System.in);
        System.out.println("digite codigo do preço do produto..:");
        codigo = entrada.nextInt();
        System.out.println("digite codigo do produto..:");
        codigo = entrada.nextInt();

        System.out.println("digite o peso do produto.: (kg) = ");
        peso = entrada.nextInt();
        switch (codigo)
        { case 1:
            gramas = peso /100;
            imposto = 0;
            valorTotal = preco + imposto;
            System.out.println("produto em gramas..:"+gramas);
            System.out.println("valor final do produto..:"+valorTotal);

            break;
            case 2:
                gramas = peso /100;
                preco = gramas *10;
                imposto = preco * 15/100;
                valorTotal = preco + imposto;
                System.out.println("produto em gramas..:"+gramas);
                System.out.println("valor final do produto..:"+valorTotal);
                break;
            case 3:
                gramas = peso / 100;
                preco = gramas * 10;
                imposto = preco * 25/100;
                valorTotal = preco + imposto;
                System.out.println("produto em gramas..:"+gramas);
                System.out.println("valor final do produto..:"+valorTotal);
                break;
            case 4:
                gramas = peso / 100;
                preco = gramas * 10;
                valorTotal = preco;
                System.out.println("produto em gramas..:"+gramas);
                System.out.println("valor final do produto..:"+valorTotal);
                break;
            case 5:
                gramas = peso / 100;
                preco = gramas * 25;
                valorTotal = preco;
                System.out.println("produto em gramas..:"+gramas);
                System.out.println("valor final do produto..:"+valorTotal);
                break;
            case 6:
                gramas = peso / 100;
                preco = gramas * 25;
                valorTotal = preco;
                System.out.println("produto em gramas..:"+gramas);
                System.out.println("valor final do produto..:"+valorTotal);
                break;
            case 7:
                gramas = peso / 100;
                preco = gramas * 25;
                valorTotal = preco;
                System.out.println("produto em gramas..:"+gramas);
                System.out.println("valor final do produto..:"+valorTotal); System.out.println(" julho");
                break;
            case 8:
                gramas = peso / 100;
                preco = gramas * 35;
                valorTotal = preco;
                System.out.println("produto em gramas..:"+gramas);
                System.out.println("valor final do produto..:"+valorTotal);
                break;
            case 9:
                gramas = peso / 100;
                preco = gramas * 35;
                valorTotal = preco;
                System.out.println("produto em gramas..:"+gramas);
                System.out.println("valor final do produto..:"+valorTotal);
                break;
            case 10:
                gramas = peso / 100;
                preco = gramas * 35;
                valorTotal = preco;
                System.out.println("produto em gramas..:"+gramas);
                System.out.println("valor final do produto..:"+valorTotal);
                break;



    }
}
    }

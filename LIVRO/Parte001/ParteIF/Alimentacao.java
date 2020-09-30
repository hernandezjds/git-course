package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Alimentacao {
    public static void main(String[] args) {
        double preco, valorAdici, imposto=0, desconto=0, novoPreco,precocusto;
        char opcoes, nes;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o preço do produto..:");
        preco = entrada.nextDouble();
        System.out.println("digite o a letra do  produto..: (N) Nao refigerado(S)com refigeração..:");
        nes = entrada.next().charAt(0);
        System.out.println("digite o a letra do  produto..: (A) Alimentação (L)Limpeza (V)vestuario..:");
        opcoes = entrada.next().charAt(0);

        if ((nes == 'a') || (nes < 15)) {
            valorAdici = 2;
            if (preco >= 15) ;
            valorAdici = 5;
        }

             if ((preco == 'l') || (preco < 10)) {
                 valorAdici = 1.50;
                 if (preco>= 10) ;
                 valorAdici = 2.50;
             }

               if ((preco == 'n' && nes == 'v') || (preco < 30)) {
                   valorAdici =  3.00;
                   if (preco >= 30) ;
                   valorAdici = 2.50;
               }

        if (nes == 'a')
            valorAdici = 8;
            if (nes == 'b') ;
            valorAdici = 0;
            if (nes == 'v') ;
            valorAdici = 0;

               preco = preco + valorAdici;
               System.out.println("valor foi adicionado..: "+preco);

             if (preco < 25) {
                 imposto = preco * 5 / 100;
                 if (preco >= 25)
                     imposto = preco * 8 / 100;
             }

            precocusto = preco + imposto;
            System.out.println("preço de custo..: "+precocusto);

        if (nes != 's' && opcoes != 'a')
            desconto = precocusto * 3/100;
        else
            desconto = 0;
            System.out.println("desconto..: "+desconto);
            novoPreco = preco + valorAdici - desconto;
            System.out.println("novo preço..: "+novoPreco);

        if (novoPreco <= 50)
            System.out.println("Barato");
        else if (novoPreco < 100)
            System.out.println("Normal");
        else
            System.out.println("Caro");










    }
}

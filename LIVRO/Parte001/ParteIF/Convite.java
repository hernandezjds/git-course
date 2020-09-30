package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Convite {
    public static void main(String[] args) {
        double custo, preçoConvite, quantidadeconvite, devesem;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o valor total do espetaculo..: = ");
        custo = entrada.nextDouble();
        System.out.println("digite o valor dos preço convite..: = ");
        preçoConvite = entrada.nextDouble();
        quantidadeconvite = custo / preçoConvite;
        System.out.println("quantidade de convite..: = "+quantidadeconvite);
    }
}

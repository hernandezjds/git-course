package Logica2020;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double largura, compri,valorQuadrado,valorArea,preco;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite a largura do terreno..:");
        largura = dados.nextDouble();
        System.out.println("digite a comprimento  do terreno..:");
        compri = dados.nextDouble();
        System.out.println("digite a valor do metro quadrado..:");
        valorArea = dados.nextDouble();
        valorQuadrado = largura * compri;
        preco = valorArea * valorQuadrado;
        System.out.println(" area do terreno..:"+valorQuadrado);
        System.out.println(" preço do metro quadrado..:"+preco);


    }
}

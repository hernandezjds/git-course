package Logica2020;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        double base, altura, area, perimetro, diagonal;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite a base..:");
        base = dados.nextDouble();
        System.out.println("digite a altura..:");
        altura = dados.nextDouble();
        area = base * altura;
        perimetro = (2 * base)+(2 * altura);
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        System.out.println("area do retangulo..:"+area);
        System.out.println("perimento do retangulo..:"+perimetro);
        System.out.println("diagonal do retangulo..:"+diagonal);



    }
}

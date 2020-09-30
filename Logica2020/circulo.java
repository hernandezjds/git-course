package Logica2020;

import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        double raio,area;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite o valor do raio do circulo..:");
        raio = dados.nextDouble();
        area = Math.PI*(Math.pow(raio,2));
        System.out.println("a area do circulo e de ..:"+area);
    }
}

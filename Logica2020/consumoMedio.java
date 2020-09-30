package Logica2020;

import java.util.Scanner;

public class consumoMedio {
    public static void main(String[] args) {
        float distancia, gasolina,mediaDeConsumo;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite distancia percorrida em KM..:");
        distancia = dados.nextFloat();
        System.out.println("digite o cursumo do veiculo..:");
        gasolina = dados.nextFloat();
        mediaDeConsumo = distancia / gasolina;
        System.out.println("o consumo medio do veiculo é..:"+mediaDeConsumo);
    }
}

package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Minutos {
    public static void main(String[] args) {
        double horas, minutos,conversao;
        int h;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite as horas..: = ");
        horas = entrada.nextDouble();
        h = (int)horas;
        minutos = horas - h;
        conversao = horas * 60 + minutos * 100;
        conversao = Math.ceil(conversao);
        System.out.println("horas em minutos..: = "+ conversao);
    }
}

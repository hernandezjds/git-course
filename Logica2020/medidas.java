package Logica2020;

import java.util.Scanner;

public class medidas {
    public static void main(String[] args) {
        float A,B,C,areat,areatra,area;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite a medida A..:");
        A = dados.nextFloat();
        System.out.println("digite a medida B..:");
        B = dados.nextFloat();
        System.out.println("digite a medida C..:");
        C= dados.nextFloat();
        area = A * A;
        areat = (A * B) /2;
        areatra = ((A + B) * C) /2;
        System.out.println("a area do quadrado e de..:"+area);
        System.out.println("a area do triangulo ..:"+areat);
        System.out.println("a area do trapezio ..:"+areatra);



    }
}

package Logica2020;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        int idade1,idade2, media;
        String nome1,nome2;
        Scanner  dados = new Scanner(System.in);
        System.out.println("digite idade 01..:");
        idade1 = dados.nextInt();
        System.out.println("digite idade 02..:");
        idade2 = dados.nextInt();
        System.out.println("digite nome 01..:");
        nome1 = dados.next();
        System.out.println("digite nome 01..:");
        nome2 = dados.next();
        media = (idade1 + idade2) /2;
        System.out.println("seu nome é..:"+nome1);
        System.out.println("seu nome é..:"+nome2);
        System.out.println("seu idade é..:"+idade1);
        System.out.println("seu idade é..:"+idade2);
        System.out.println("a media de idade  "+nome1+" e "+nome2+" é de "+media+" anos");
    }
}

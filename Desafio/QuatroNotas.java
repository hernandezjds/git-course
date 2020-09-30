package Desafio;

import java.util.Scanner;

public class QuatroNotas {
    public static void main(String[] args) {
        float nota1, nota2,nota3, nota4, media;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite nota1..:");
        nota1 = entrada.nextFloat();
        System.out.println("digite nota2..:");
        nota2 = entrada.nextFloat();
        System.out.println("digite nota3..:");
        nota3 = entrada.nextFloat();
        System.out.println("digite nota4..:");
        nota4 = entrada.nextFloat();
        media = nota1+ nota2+ nota3+ nota4 /10;
        System.out.println("digite media final..:"+media);
        if (media >= 7)
            System.out.println("aprovado..:"+media);
        else
            System.out.println("reprovado..:"+media);

    }

}

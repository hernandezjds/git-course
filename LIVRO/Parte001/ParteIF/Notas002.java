package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Notas002 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite a primeira nota..: = ");
        nota1 = entrada.nextFloat();
        System.out.println("digite a segunda nota..: = ");
        nota2 = entrada.nextFloat();
        System.out.println("digite a terceira nota..: = ");
        nota3 = entrada.nextFloat();

        media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        System.out.println("Média ponderada: " + media);
        if (media >= 8 && media <= 10)
            System.out.println("Obteve conceito A");
        else if (media >= 7)
            System.out.println("Obteve conceito B");
        else if (media >= 6 )
            System.out.println("Obteve conceito C");
       else if (media >= 5 )
            System.out.println("Obteve conceito D");
        if (media < 5)
            System.out.println("Obteve conceito E");



        }
    }



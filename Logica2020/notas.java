package Logica2020;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        int nota1, nota2,nota3,media;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite primeira nota..:");
        nota1 = dados.nextInt();
        System.out.println("digite segunda  nota..:");
        nota2 = dados.nextInt();
        System.out.println("digite terceira nota..:");
        nota3 = dados.nextInt();
        media = nota1 + nota2 + nota3 / 3;
        if (media > 60)
            System.out.println("aluno aprovado..:");
        else
            System.out.println("aluno reprovado..:");

    }
}

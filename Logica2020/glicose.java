package Logica2020;

import java.util.Scanner;

public class glicose {
    public static void main(String[] args) {
        int qtdGlicose;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite a quantidade de glicose..:");
        qtdGlicose = dados.nextInt();
        if (qtdGlicose <= 100) {
            System.out.println("niveis de glicose normal");
        }
        /* em cima ja foi testado e ser a condiçao for falsa a glicose ja sera maior do que 100 por isso
        pode ser so uma condicao
        (qtdGlicose >= 100 && qtdGlicose <= 140)
         */
        else if (qtdGlicose <= 140)
            System.out.println("niveis de glicose elevado cuidado..:");
        else System.out.println("niveis de elevado de acucar vc tem diabetes..:");
    }
}

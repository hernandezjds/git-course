package LogicaGeek;

import java.util.Scanner;

public class Secao7EX04 {
    public static void main(String[] args) {
        int maior = -999, menor = 999,valor, i;
        float media,soma = 0;
        Scanner entrada = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.println("informe um numero..:");
            valor = entrada.nextInt();
            if (valor > 0) {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
                soma = soma + valor;
            }else {
                    i--;
                }


        }
            media = soma / 10;
            System.out.println("o maior numero..:" + maior);
            System.out.println("o menor numero..:" + menor);
            System.out.println("a media dos numeros é" + media);
            entrada.close();


    }
    }


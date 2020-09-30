package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Salario009 {
    public static void main(String[] args) {
        int salarioBase, salarioLiquido, imposto=0, gratificacao, tempo;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o salario base..:");
        salarioBase = entrada.nextInt();
        System.out.println("digite o tempo de casa..:");
        tempo = entrada.nextInt();
        if (salarioBase < 200) {
           imposto =0;
        if (salarioBase <= 450)
                imposto = salarioBase * 3/100;
            else if (salarioBase < 700)
                imposto = salarioBase * 8/100;
            else imposto = salarioBase * 12/100;
            System.out.println("valor do imposto..:"+imposto);
        }

        if (salarioBase >500) {
            if (tempo >= 3)
                gratificacao = 20;
            else gratificacao = 30;
        }
        else {
            if (tempo <= 3)
                gratificacao = 23;
            else if (tempo < 6)
                gratificacao = 35;
            else
                gratificacao = 33;
        }
        System.out.println("Gratificação = " + gratificacao);

        salarioLiquido = salarioBase - imposto + gratificacao;
        System.out.println("Salário líquido = " +salarioLiquido);
        if (salarioLiquido <= 350)
            System.out.println("classificacao ..: A "+salarioLiquido);
        else if (salarioLiquido < 600)
            System.out.println("classificacao ..: B "+salarioLiquido);
        else
            System.out.println("classificacao ..: C "+salarioLiquido);
        }



    }

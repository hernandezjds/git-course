package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Cargo {
    public static void main(String[] args) {
        double salarioAtual, cargo2, aumentoSalario, novoSalario;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.print("digite salario atual..: = ");
        salarioAtual = entrada.nextDouble();
        System.out.print("digite seu cargo..: = ");
        cargo2 = entrada.nextDouble();

        if (cargo2 == 1) {
            System.out.println("o cargo e escrituario");
            aumentoSalario = (salarioAtual * 50) / 100;
            System.out.println("seu aumento foi de 50%..: = " + aumentoSalario);
            novoSalario = salarioAtual + aumentoSalario;
            System.out.println("seu novo salario..: = " + novoSalario);
        } else if (cargo2 == 2) {
            System.out.println("o cargo e secretario");
            aumentoSalario = salarioAtual * 35 / 100;
            System.out.println("seu aumento foi de 35%..: = " + aumentoSalario);
            novoSalario = salarioAtual + aumentoSalario;
            System.out.println("seu novo salario..: = " + novoSalario);
        } else if (cargo2 == 3) {
            System.out.println("o cargo e caixa");
            aumentoSalario = salarioAtual * 20 / 100;
            System.out.println("seu aumento foi de 20%..: = " + aumentoSalario);
            novoSalario = salarioAtual + aumentoSalario;
            System.out.println("seu novo salario..: = " + novoSalario);
        } else if (cargo2 == 4) {
            System.out.println("o cargo e gerente");
            aumentoSalario = salarioAtual * 10 / 100;
            System.out.println("seu aumento foi de 10%..: = " + aumentoSalario);
            novoSalario = salarioAtual + aumentoSalario;
            System.out.println("seu novo salario..: = " + novoSalario);
        } else if (cargo2 == 5) {
            System.out.println("o cargo e diretor ");
            aumentoSalario = salarioAtual * 0 / 100;
            System.out.println("nao tem aumento..: = ");
            novoSalario = salarioAtual + aumentoSalario;
            System.out.println("seu novo salario..: = " + novoSalario);
        } else System.out.println("cargo inexistente !");
    }


}


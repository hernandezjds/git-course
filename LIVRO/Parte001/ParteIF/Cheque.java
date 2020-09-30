package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Cheque {
    public static void main(String[] args) {
       double salario, cheque1, cheque2, saldoAtual, cpmf1, cpmf2;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o salario do funcionario");
        salario = entrada.nextFloat();
        System.out.println("digite o valor do segundo cheque");
        cheque1 = entrada.nextFloat();
        System.out.println("digite o valor do primeiro cheque ");
        cheque2 = entrada.nextFloat();
        cpmf1 =(cheque1 * 0.38) / 100;
        cpmf2 =(cheque2 * 0.38) / 100;
        saldoAtual = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
        System.out.println("salto atual..: = "+saldoAtual);



    }
}

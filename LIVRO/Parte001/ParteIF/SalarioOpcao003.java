package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class SalarioOpcao003 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        double salario, novoSalario,auxilioEscola ,bonificacao;
        System.out.println("digite o salario do funcionario.:");
        salario = entrada.nextDouble();

        if (salario <= 500)
            bonificacao = (salario * 5) / 100;
          else if (salario < 1200)
            bonificacao = (salario * 12) / 100;
          else
              bonificacao = 0;

            if (salario <= 600)
                auxilioEscola = 150;

            else
                auxilioEscola = 100;
            novoSalario = salario + bonificacao + auxilioEscola;
        System.out.println("seu novo salario e .: = "+novoSalario);



    }
}

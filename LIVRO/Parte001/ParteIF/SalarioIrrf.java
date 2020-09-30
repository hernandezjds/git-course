package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class SalarioIrrf {
    public static void main(String[] args) {
        double salario, horasExtras, numeroFilho, valorhoras, SalarioBruto,numeroHoras,imposto, salarioLiquido, grad =0, valorArecebe;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o salario do funcionario.:");
        salario = entrada.nextDouble();
        System.out.println("numero de horas trabalhada.:");
        numeroHoras = entrada.nextDouble();
        System.out.println("numero de dependentes..:");
        numeroFilho = entrada.nextDouble();
        System.out.println("numero de horas extras trabalhada.:");
        valorhoras = entrada.nextDouble();
        valorhoras = salario * 1/5;
        horasExtras = numeroHoras * (valorhoras +(valorhoras * 50 /100));
        salario = valorhoras * numeroHoras;
        numeroFilho = numeroFilho * 32;
        SalarioBruto = salario + numeroFilho + horasExtras;

        if (SalarioBruto < 200)
            imposto = 0;

         else if (SalarioBruto <= 500)
             imposto = SalarioBruto * 10 / 100;
               else
                imposto = SalarioBruto * 20 / 100;
            System.out.println("valor do imposto a ser pago..:"+imposto);
            salarioLiquido =  SalarioBruto - imposto;

        if (salarioLiquido <= 350)
            grad = 100;
        else if (salarioLiquido >= 350)
            grad = 50;
            valorArecebe = salarioLiquido + grad;

        System.out.println("salario liquido e .:"+valorArecebe);



        




    }


}

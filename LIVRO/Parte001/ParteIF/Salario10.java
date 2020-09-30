package LIVRO.Parte001.ParteIF;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario10 {
    public static void main(String[] args) {
        double salarioMinimo, salarioBruto, salarioLiquido, numeroHoras,
                auxilio=0,coeficiente=0, imposto=0, gratificacao;
       char turno,cargo;
        Scanner entrada;
        entrada = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat ("0.00");
        System.out.println("digite o salario minimo..:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("digite numeros de horas trabalhada..:");
        numeroHoras = entrada.nextDouble();
        System.out.println("digite o turno do trabalho (m)manha.(v)tarde.(n)noite..:");
        turno = entrada.next().charAt(0);
        System.out.println("digite o cargo do trabalhado (o)operado.(g)gerente..:");
        cargo = entrada.next().charAt(0);
        if (turno == 'm')
            coeficiente = salarioMinimo * 10 /100;
            if (turno == 'v')
                coeficiente = salarioMinimo * 15 /100;
            if (turno == 'n')
                coeficiente = salarioMinimo * 12 /100;
            System.out.println("valor do coeficiente do salario..:"+casas.format(coeficiente));


        salarioBruto = numeroHoras * coeficiente;
        System.out.println("valor do salario bruto..:"+casas.format(salarioBruto));

        if (cargo =='o'){
            if (salarioBruto >= 300)
                imposto = salarioBruto * 5/100;
            else
            imposto = salarioBruto * 3/100;

        }
        if (cargo =='g'){
            if (salarioBruto >= 400)
                imposto = salarioBruto * 6/100;
            else
                imposto = salarioBruto * 4/100;

        }
        System.out.println("valor do imposto ..:"+casas.format(imposto));

        if (turno == 'n' && numeroHoras > 80)
            gratificacao = 50;
        else gratificacao = 30;
        System.out.println("valor da gratificaçao..:" +casas.format(gratificacao));


       if (cargo == 'o')
           if (coeficiente <= 25)
               auxilio = salarioBruto * 1/3;
           else auxilio= salarioBruto * 1/2;
        System.out.println("Valor do auxílio alimentação = " +casas.format(+auxilio));

           salarioLiquido = (salarioBruto + gratificacao + auxilio) - imposto;
        System.out.println("Valor do salário líquido = " +casas.format(salarioLiquido));
           if (salarioLiquido < 350)
               System.out.println("funcionario mal remunerado..:"+salarioLiquido);
        if (salarioLiquido >= 350 && salarioLiquido <= 600)
            System.out.println("funcionario normal..:"+salarioLiquido);
        if (salarioLiquido > 600)
            System.out.println("Bem Remunerado");



    }

}

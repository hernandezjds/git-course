package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) {
        float salario = 1045, horasExtra, imposto, SalarioBruto;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o horas trabalhada do funcionario..: = ");
        salario = entrada.nextFloat();
        System.out.println("digite horas extras trabalhada..: = ");
        horasExtra = entrada.nextFloat();
        horasExtra = salario /2;
        SalarioBruto = salario * horasExtra;
        imposto = SalarioBruto * 3 /100;
        SalarioBruto = SalarioBruto - imposto;
        System.out.println("o salario bruto do funcionario..: = "+SalarioBruto);
    }
}

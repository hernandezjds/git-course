package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class SalarioOpcoes {
    public static void main(String[] args) {
        double imposto = 0, salario, novoSalario, aumento =0;
        int opcao;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println( "Menu de Opções");
        System.out.println("1 - Imposto");
        System.out.println("2 - Novo Salário");
        System.out.println("3 - Classificação");
        System.out.println("Digite a opção desejada");
        opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("digite o salario do funcionario..:");
                salario = entrada.nextDouble();
                if (salario <= 500)
                    imposto = salario * 5 / 100;

                if (salario >=500 && salario <= 850)
                    imposto = salario * 10 / 100;

                if (salario > 850)
                    imposto = salario * 15 / 100;
                System.out.println("valor do imposto..: " + imposto);

                break;

            case 2: {
                System.out.println("digite o salario do funcionario..:");
                salario = entrada.nextDouble();
                if (salario > 1500)
                    aumento = 25;

                if (salario >=750 && salario <= 1500)
                    aumento = 50;

                if (salario >=450 && salario <= 750)
                    aumento = 75;

                if (salario <= 450)
                    aumento = 100;
                novoSalario = salario + aumento;
                System.out.println("valor do novo salario..: " + novoSalario);

                break;
            }
            case 3: {
                System.out.println("digite o salario do funcionario..:");
                salario = entrada.nextDouble();
                if (salario <= 700)
                    System.out.println("valor do funcionario mal remunerado..: ");

                if (salario > 700)
                    System.out.println("valor do funcionario bem remunerado..: ");

                break;
            }
            default: System.out.println( "Opção Inválida");
        }

    }

}
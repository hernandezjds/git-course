package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Quilowatt {
    public static void main(String[] args) {
        double salario, quantidadeqwatt, valorqui,  valorSerPago, valorDesconto, desconto;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite seu salario..: = ");
        salario = entrada.nextDouble();
        System.out.println("quantidade de quilowatt..: = ");
        quantidadeqwatt = entrada.nextDouble();
        valorqui = salario / 5;
        valorSerPago = valorqui * quantidadeqwatt;
        desconto = (valorSerPago * 15) /100;
        valorDesconto = valorSerPago - desconto;
        System.out.println("o valor de cada quilowatt e..: = "+valorqui);
        System.out.println("o valor a ser pago por essa residencia e..: = "+valorSerPago);
        System.out.println("valor a ser pago com desconto de 15% e ..:"+valorDesconto);
    }
}

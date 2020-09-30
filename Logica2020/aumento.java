package Logica2020;

import java.util.Scanner;

public class aumento {
    public static void main(String[] args) {
        double salarioAtual, aumentoDando,novoSalario;
        int porcentagem=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o valor do salario do funcionario..:");
        salarioAtual = entrada.nextDouble();
        if (salarioAtual <= 1000){
            porcentagem = 20; }

        else  if (salarioAtual <= 3000){
            porcentagem = 15; }

        else  if (salarioAtual <= 8000){
            porcentagem = 10; }

        else  if (salarioAtual > 8000){
            porcentagem = 5; }

             aumentoDando= (salarioAtual * porcentagem) /100;
             novoSalario = salarioAtual + aumentoDando;
             System.out.println("novo salario e de :"+novoSalario);
             System.out.println("o aumento dado foi de "+aumentoDando);
             System.out.printf("Porcentagem = %d %%\n", porcentagem);


    }
}

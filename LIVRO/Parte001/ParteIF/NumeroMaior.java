package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.print("digite o primeiro numero ");
        num1 = entrada.nextInt();
        System.out.print("digite o segundo numero ");
        num2 = entrada.nextInt();
        if(num1 > num2)
            System.out.println("o primeiro numero maior que o segundo "+num1);
        else if (num2 > num1)
            System.out.println("o segundo numero e maior que o primeiro "+num2);
        else
        System.out.println("os numero sao iguais ");




    }
}

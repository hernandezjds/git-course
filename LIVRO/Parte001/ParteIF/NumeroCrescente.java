package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class NumeroCrescente {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.print("digite o primeiro numero ");
        num1 = entrada.nextInt();
        System.out.print("digite o segundo numero ");
        num2 = entrada.nextInt();
        System.out.print("digite o segundo numero ");
        num3 = entrada.nextInt();
        if (num1 < num2 && num1 < num3)
        {
            if (num2 < num3)
                System.out.println("A ordem crescente dos números é: " + num1 + " - " + num2 + " - " + num3);
            if (num3 < num2)
                System.out.println("A ordem crescente dos números é: " + num1 + " - " + num3 + " - " + num2);
        }
        if (num2 < num1 && num2 < num3)
        {
            if (num1 < num3)
                System.out.println("A ordem crescente dos números é: " + num2 + " - " + num1 + " - " + num3);
            if (num3 < num1)
                System.out.println("A ordem crescente dos números é: " + num2 + " - " + num3 + " - " + num1);
        }
        if (num3 < num1 && num3 < num2)
        {
            if (num1 < num2)
                System.out.println("A ordem crescente dos números é: " + num3 + " - " + num1 + " - " + num2);
            if (num2 < num1)
                System.out.println("A ordem crescente dos números é: " + num3 + " - " + num2 + " - " + num1);
        }
    }

    }


package Desafio;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        float numero1, numero2;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite um numero 1..:");
        numero1= entrada.nextFloat();
        System.out.println("digite um numero 2..:");
        numero2 = entrada.nextFloat();
        if (numero1 > numero2)
            System.out.println("numero 01 e maior..:"+numero1);
        if (numero2 > numero1)
            System.out.println("numero 02 e maior..:"+numero1);
        if (numero2 == numero1)
            System.out.println("os numeros sao iguais..:"+numero1);
    }
}

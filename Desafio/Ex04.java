package Desafio;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        float numero1, numero2, numero3, local;

        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite um numero 1..:");
        numero1= entrada.nextFloat();
        System.out.println("digite um numero 2..:");
        numero2 = entrada.nextFloat();
        System.out.println("digite um numero 3..:");
        numero3 = entrada.nextFloat();

        if (numero1 > numero2 )
            local = numero1;
        else
            local = numero2;
        if (local > numero3)
            System.out.println("este é o numero maior..:"+numero3);
        if (numero2 == numero1)
            System.out.println("os numeros sao iguais..:");
    }
}

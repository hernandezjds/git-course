package LIVRO.Parte001.ParteIF;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UmElevado {
    public static void main(String[] args) {
        double num1, num2, elevado1,elevado2;
        Scanner  entrada;
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");
        entrada = new Scanner(System.in);
        System.out.println("digite o primeiro numero..: = ");
        num1 = entrada.nextDouble();
        System.out.println("digite o segundo numero..: = ");
        num2 = entrada.nextDouble();
        elevado1 = Math.pow(num1,num2);
        elevado2 = Math.pow(num1,num1);
        System.out.println("primeiro numero elevado com o segundo..: = "+elevado1);
        System.out.println("segundo numero elevado com o primeiro ..: = "+elevado2);

    }
}

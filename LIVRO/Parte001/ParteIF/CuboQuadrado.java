package LIVRO.Parte001.ParteIF;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CuboQuadrado {
    public static void main(String[] args) {
        double num,cubo,quadrado,raiz2,raiz3;
        Scanner entrada;
        DecimalFormat casas;
        casas = new DecimalFormat("0.000");
        entrada = new Scanner(System.in);
        System.out.println("digite um numero..: = ");
        num = entrada.nextDouble();
        quadrado = Math.pow(num,2);
        cubo = Math.pow(num,3);
        raiz2 = Math.sqrt(num);
        raiz3 = Math.cbrt(num);
        System.out.println("numero ao quadrado e ..; = "+quadrado);
        System.out.println("numero ao cubo e..: = "+cubo);
        System.out.println("raiz quadrada e..: = "+raiz2);
        System.out.println("raiz cubica..: = "+raiz3);

    }
}

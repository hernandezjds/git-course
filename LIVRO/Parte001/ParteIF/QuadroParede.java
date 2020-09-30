package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class QuadroParede {
    public static void main(String[] args) {
        double x, z, y;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o altura da escada..: = " );
        z = entrada.nextFloat();
        System.out.println("digite o altura da parede..: = " );
        x = entrada.nextFloat();
        y = Math.pow(z,2) - Math.pow(x,2);
        y= Math.sqrt(y);
        System.out.println("o comprimento da escada..: = "+y);

    }
}

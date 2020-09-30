package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class alturaEscada {
    public static void main(String[] args) {
        double angulo, altura, escada, radiano;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o angulo da escada..: = " );
        angulo = entrada.nextFloat();
        System.out.println("digite o altura da parede..: = " );
        altura = entrada.nextFloat();
        radiano = (angulo * 3.14 ) / 180;
        escada = altura / Math.sin(radiano);
        System.out.println("o comprimento da escada..: = "+escada);

    }
}

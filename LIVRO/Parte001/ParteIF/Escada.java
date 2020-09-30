package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        int alturaEscada, alturaSubida, quantidadeDegrau;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("altura do degrau..: (metro) = ");
        alturaEscada = entrada.nextInt();
        System.out.println("altura que vc quer chega..: (metro) = ");
        alturaSubida = entrada.nextInt();
        quantidadeDegrau = alturaSubida / alturaEscada ;
        System.out.println("para vc chega a altura desejeda vc precisa subi..: = "+quantidadeDegrau);

    }
}

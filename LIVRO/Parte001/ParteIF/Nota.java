package LIVRO.Parte001.ParteIF;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        int n1,n2,n3,soma;
        Scanner entrada;
        entrada = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");
        System.out.println("digite quatro numero");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();

        soma = (n1+n2+n3) /3;
        System.out.println("soma = "+soma);
        JOptionPane.showMessageDialog(null,"a media é...:"+casas.format(soma));
    }

}
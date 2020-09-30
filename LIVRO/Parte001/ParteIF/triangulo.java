package LIVRO.Parte001.ParteIF;

import javax.swing.*;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        int altura, largura, area;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite a altura..:");
        altura = entrada.nextInt();
        System.out.println("digite a largura...:");
        largura = entrada.nextInt();
        area = (altura * largura) /2;
        System.out.println("o triangulo e..:"+area);
        JOptionPane.showMessageDialog(null,"o triangulo é..:"+area);
    }
}

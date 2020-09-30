package LIVRO.Parte001.ParteIF;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        double raio,area;
        Scanner entrada;
        DecimalFormat casas;
        casas = new DecimalFormat("0.00000000");
        entrada = new Scanner(System.in);
        System.out.print("digite o raio...:");
        raio = entrada.nextDouble();
        area = Math.PI* Math.pow(raio,2);
        System.out.println("a area do circulo e ..:"+area);
        JOptionPane.showMessageDialog(null,"a area do circulo e...:"+area);

    }

}

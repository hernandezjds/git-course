package LIVRO.Parte001.ParteIF;

import javax.swing.*;

public class Triangulo {
    public static void main(String[] args) {
        int altura, largura, area, perimetro;
        altura = Integer.parseInt(JOptionPane.showInputDialog("digite a altura..:"));
        largura = Integer.parseInt(JOptionPane.showInputDialog("digite a largura..:"));
        area = altura * largura;
        perimetro = ((2 * altura) + (2 * largura));
        JOptionPane.showMessageDialog(null, "a area do triangulo e..:"+area);
        JOptionPane.showMessageDialog(null, "o perimetro do triangulo e..:"+perimetro);


    }
}

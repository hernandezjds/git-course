package Neri;

import javax.swing.*;

public class Juros {
    public static void main(String[] args) {
        float prestacao, ValorPrestacao, Taxa;
        int DiasAtraso;
                ValorPrestacao = Float.parseFloat(JOptionPane.showInputDialog(null,"digite o valor das prestraçoes"));
                Taxa = Float.parseFloat(JOptionPane.showInputDialog(null,"digite a taxa de juros..:"));
                 DiasAtraso = Integer.parseInt(JOptionPane.showInputDialog("digite dias em atraso..:"));
         prestacao = ValorPrestacao +( ValorPrestacao * (Taxa / 100) * DiasAtraso);
         JOptionPane.showMessageDialog(null, "o valor corrigido e de ...:"+prestacao);






    }
}

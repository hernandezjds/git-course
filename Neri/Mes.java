package Neri;

import javax.swing.*;

public class Mes {
    public static void main(String[] args) {
        int meses;

        meses = Integer.parseInt(JOptionPane.showInputDialog("digite o mes..:"));
                if (meses == 1)
                    JOptionPane.showMessageDialog(null,"janeiro");

                else if (meses == 2)JOptionPane.showMessageDialog(null,"fevereiro");
                else if (meses == 3)JOptionPane.showMessageDialog(null,"março");
                else if (meses == 4)JOptionPane.showMessageDialog(null,"abril");
                else if (meses == 5)JOptionPane.showMessageDialog(null,"maio");
                else if (meses == 6)JOptionPane.showMessageDialog(null,"junho");
                else if (meses == 7)JOptionPane.showMessageDialog(null,"julho");
                else if (meses == 8)JOptionPane.showMessageDialog(null,"agosto");
                else if (meses == 9)JOptionPane.showMessageDialog(null,"setembro");
                else if (meses == 10)JOptionPane.showMessageDialog(null,"outubro");
                else if (meses == 11)JOptionPane.showMessageDialog(null,"novembro");
                else if (meses == 12)JOptionPane.showMessageDialog(null,"dezembro");
                else  JOptionPane.showMessageDialog(null, "o mes nao existe");



    }
}

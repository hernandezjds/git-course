package Neri;

import javax.swing.*;

public class TrocaValores {
    public static void main(String[] args) {
        int A, B, Auxiliar;
        A = 5;
        B = 10;

        JOptionPane.showMessageDialog(null, "antes da troca : \n A = " +A+ "" +
                " e \n B =" +B);
        Auxiliar = A;
        A = B;
        B = Auxiliar;
        JOptionPane.showMessageDialog(null, "depois  da troca : \n = " +A+ "" +
                " e \n B =" +B);


    }
}

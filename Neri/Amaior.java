package Neri;

import javax.swing.*;

public class Amaior {
    public static void main(String[] args) {
        int A, B;

        A = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de A...:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de B...:"));
        if (A>B)
            JOptionPane.showMessageDialog(null, "valor em ordem crescente...: A="+A+ "- B ="+B);

        else
            JOptionPane.showMessageDialog(null, "valor em ordem crescente...: A="+A+ "- B ="+B);

    }



}

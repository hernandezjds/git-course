package Neri;

import javax.swing.*;

public class Triangulo {
    public static void main(String[] args) {
        int le, ld, li;

        le = Integer.parseInt(JOptionPane.showInputDialog("digite LE..:"));
        ld = Integer.parseInt(JOptionPane.showInputDialog("digite LD..:"));
        li = Integer.parseInt(JOptionPane.showInputDialog("digite LI..:"));

        if ((li < (le + ld)) && (le < (ld + li)) && (ld < (li + le)))
            if ((le == ld) && (le == li)) {

                JOptionPane.showMessageDialog(null, "triangulo equilatero");

            } else if ((li == ld) || (li == le) || (le == ld))

                JOptionPane.showMessageDialog(null, "triangulo isosceles");

            else
                JOptionPane.showMessageDialog(null, "triangulo escaleno");

        else
            JOptionPane.showMessageDialog(null, "nao e um triangulo ");


    }
}

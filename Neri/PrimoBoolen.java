package Neri;

import javax.swing.*;

public class PrimoBoolen {
    public static void main(String[] args) {
        int numero,i;
        boolean contador = true;
        i = 2;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero..:"));
        while ((i <= numero /2) && (contador  == true))

        {
            if (numero %  i == 0)
            contador = false;
            i =i+1;
        }

        if (contador)
            JOptionPane.showMessageDialog(null, "o numero "+numero+" -  e primo..:");
        else
            JOptionPane.showMessageDialog(null, "o numero "+numero+" - nao  e primo..:");
    }

}

package Neri;

import javax.swing.*;

public class Tabuada004 {
    public static void main(String[] args) {
        int i, numero;
        String mensagem = "";
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero..:"));
        i = 1;
        do {

            mensagem = mensagem + "\n " + numero + " x" + i + " = " + (numero * i);
            i++;
        }
        while (i <= 10);

        JOptionPane.showMessageDialog(null, mensagem);


    }
}
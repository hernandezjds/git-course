package Neri;

import javax.swing.*;

public class ParImpar {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero..;"));
        if (numero % 2 == 0)
            JOptionPane.showMessageDialog(null, "numero e par");
        else
            JOptionPane.showMessageDialog(null, "numero e impar");



    }











}

package Neri;

import javax.swing.*;

public class Tabuada003 {
    public static void main(String[] args) {
        int i, numero;
        String mensagem = "";
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero..:"));
        i = 1;
        while (i <= 10){

                mensagem = mensagem + "\n " + numero + " x" + i + " = " + (numero * i);
                i++;
        }


            JOptionPane.showMessageDialog(null, mensagem);





    }






}

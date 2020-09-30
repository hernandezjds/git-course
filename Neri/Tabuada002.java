package Neri;

import javax.swing.*;

public class Tabuada002 {
    public static void main(String[] args) {
        int i, numero;
        String mensagem = "";
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero..:"));
        for(i=1; i <= 10; i++)

        mensagem = mensagem +"\n "+numero +" x" +i+" = "+(numero * i);
        JOptionPane.showMessageDialog(null, mensagem);





    }






}

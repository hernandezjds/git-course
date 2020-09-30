package Neri;

import javax.swing.*;

public class Fibo003 {
    public static void main(String[] args) {
        int i,numAtual, novoNumero,
       numAnterior = 0;
        numAtual = 1;
        String mensagem = "o 1..: numero fibonacci e 1...: \n";
        for (i=2;i<=10;i++)
        {
            novoNumero = numAtual + numAnterior;
            numAnterior = numAtual;
            numAtual = novoNumero;
            mensagem = mensagem + "o"+i+ ". numero fibonacci e...:"+novoNumero+"\n";
        }
        JOptionPane.showMessageDialog(null,mensagem);
    }
}

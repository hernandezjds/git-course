package Neri;

import javax.swing.*;

public class Saldo02 {
    public static void main(String[] args) {
        float saldo = 500, cheque, valorsaldo = 0;
        cheque = Float.parseFloat(JOptionPane.showInputDialog("digite o valor do cheque...:"));
        if (cheque <= saldo) {
            valorsaldo = valorsaldo - cheque;

            JOptionPane.showMessageDialog(null, "o cheque foi descontado da sua conta...:" + cheque);
        }
        else {
            JOptionPane.showMessageDialog(null, "o cheque nao pode ser descontado por falta de saldo..: ");

            JOptionPane.showMessageDialog(null, "o seu saldo ficou...: " +saldo);
        }
















    }
}

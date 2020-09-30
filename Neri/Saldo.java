package Neri;

import javax.swing.*;

public class Saldo {
    public static void main(String[] args) {
        float conta = 500, cheque = 0, valorfinal;
        cheque = Float.parseFloat(JOptionPane.showInputDialog(null, "digite valor do cheque..:"+cheque));
        valorfinal = conta - cheque;
        JOptionPane.showMessageDialog(null, "valor final da conta..:"+valorfinal);
    }
}

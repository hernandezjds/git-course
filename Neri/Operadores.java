package Neri;

import javax.swing.*;

public class Operadores {
    public static void main(String[] args) {
        float num1 = 0, num2 = 0, soma, divisao, subtr, multip;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("digite primeiro numero:"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("digite o segundo numero:"));

        soma = num1 + num2;
        divisao = num1 / num2;
        subtr = num1 - num2;
        multip = num1 * num2;


        JOptionPane.showMessageDialog(null,
                "A soma = " +soma+"\nA divisao =" +divisao+"\nA subtraçao =" +subtr+"\n"+
                        "A multiplicaçao=" + multip);
    }
}

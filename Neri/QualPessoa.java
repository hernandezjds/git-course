package Neri;

import javax.swing.*;

public class QualPessoa {
    public static void main(String[] args) {
        String nome;
        int idade;
        float salario;
        nome = JOptionPane.showInputDialog("qual seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("qual é sua idade:"));
        salario = Float.parseFloat(JOptionPane.showInputDialog("qual é o seu Neri.salario:"));

        JOptionPane.showMessageDialog(null, "A nome = " + "\n" + nome);
        JOptionPane.showMessageDialog(null, "A idade =" + "\n" + idade);
        JOptionPane.showMessageDialog(null, "A Neri.salario =" + "\n" + salario);

    }
}

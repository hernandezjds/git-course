package Neri;

import javax.swing.*;

public class Salario003 {
    public static void main(String[] args) {
        float SalarioBruto =0,Inss = 9, ValorDesconto, SalarioLiquido;
        String nome;
        nome = JOptionPane.showInputDialog(null, "digite seu nome");
        SalarioBruto = Float.parseFloat(JOptionPane.showInputDialog(null, "digite o valor do Neri.salario bruto..:"+SalarioBruto));
        ValorDesconto = (SalarioBruto * Inss) /100;

        SalarioLiquido = SalarioBruto - ValorDesconto;
        JOptionPane.showMessageDialog(null, "\nseu nome..: "+nome);
        JOptionPane.showMessageDialog(null, "valor do desconto foi...:"+ValorDesconto);
        JOptionPane.showMessageDialog(null, "valor do Neri.salario bruto...:"+SalarioBruto);
        JOptionPane.showMessageDialog(null, "valor do Neri.salario liquido  foi...:"+SalarioLiquido);

    }
}

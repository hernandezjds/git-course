package Neri;

import javax.swing.*;

public class Vendas2 {
    public static void main(String[] args) {
        float fixo = 500, comissao = 50, ValorTotal, valorNoMes = 0;
        valorNoMes = Float.parseFloat(JOptionPane.showInputDialog(null, "quantidade de vendas" + valorNoMes));
        comissao = (valorNoMes * comissao);
        ValorTotal = fixo + comissao;


        JOptionPane.showMessageDialog(null, "Neri.salario ..:" + fixo);
        JOptionPane.showMessageDialog(null, "valor da comissao..:" + comissao);
        JOptionPane.showMessageDialog(null, "valor a recebe..:" + ValorTotal);

    }
}
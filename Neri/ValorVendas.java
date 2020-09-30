package Neri;

import javax.swing.*;

public class ValorVendas {
    public static void main(String[] args) {
        float fixo = 800, comissao = 0.15f, ValorTotal,valorV = 0;
        valorV = Float.parseFloat(JOptionPane.showInputDialog(null, "digite valor da venda..:"+valorV));

                comissao = (valorV * comissao);
                ValorTotal = fixo + comissao ;
        JOptionPane.showMessageDialog(null, "Neri.salario ..:"+fixo);
        JOptionPane.showMessageDialog(null, "valor da comissao..:"+comissao);
        JOptionPane.showMessageDialog(null, "valor a recebe..:"+ValorTotal);


    }
}

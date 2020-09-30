package Neri;

import javax.swing.*;

public class Consorcio {
    public static void main(String[] args) {
        float  ValorPre = 0, saldoDevedor, TotalPago;
        int TotalPrestracoes = 0, QuPrestracoes = 0;

        TotalPrestracoes = Integer.parseInt(JOptionPane.showInputDialog(null, "total de prestraçoes"+TotalPrestracoes));
        QuPrestracoes = Integer.parseInt(JOptionPane.showInputDialog(null, "quantidade de prestraçoes pagas"+QuPrestracoes));
        ValorPre = Float.parseFloat(JOptionPane.showInputDialog(null, "digite o valor das prestaçoes..:"+ValorPre));
        TotalPago = QuPrestracoes * ValorPre;
        saldoDevedor = ValorPre * (TotalPrestracoes - QuPrestracoes );
        JOptionPane.showMessageDialog(null, " o saldo total de prestaçoes paga ...:" +TotalPago);
        JOptionPane.showMessageDialog(null, " o saldo total de prestaçoes para paga ...:" +saldoDevedor);

    }

}

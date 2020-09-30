package Neri;

import javax.swing.*;

public class CustoCarro {
    public static void main(String[] args) {
        double ValorCarro = 0, PorcentagemV,Impostos, PrecoFinal;

        ValorCarro = Float.parseFloat(JOptionPane.showInputDialog(null, "valor do veiculos a ..:" +ValorCarro));
        PorcentagemV = (25 * ValorCarro) / 100;
        Impostos = (45 * ValorCarro) / 100;



        PrecoFinal = ValorCarro + PorcentagemV + Impostos;
        JOptionPane.showMessageDialog(null, "valor do veiculos é =" +PrecoFinal);

    }
}


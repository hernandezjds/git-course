package Neri;

import javax.swing.*;

public class ClienteDesconto {
    public static void main(String[] args) {
        float ValorCompra, ValorPaga, valordesconto;
        int desconto;
        String nome;
        nome = JOptionPane.showInputDialog("digite seu nome..:");
        ValorCompra = Float.parseFloat(JOptionPane.showInputDialog("digite o valor das compras..:"));
        if (ValorCompra <= 200)
            desconto = 10;

        else if (ValorCompra <= 500)
            desconto = 15;
        else
            desconto = 20;
        valordesconto = (ValorCompra * desconto) / 100;
        ValorPaga = ValorCompra - valordesconto;
        JOptionPane.showMessageDialog(null, "nome do cliente..:"
                + nome +
                "\n valor da compra..:" + ValorCompra +
                "\n o percentual de desconto...:" + desconto +
                "\n valor do desconto..:" + valordesconto +
                "\n valor a pagar...:" + ValorPaga);


    }


}

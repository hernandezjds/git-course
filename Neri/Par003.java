package Neri;

import javax.swing.*;

public class Par003 {

    public static void main(String[] args) {
        int numero = 1, conta = 0;
        String mensagem = "";

        while (conta < 10)
        {
            if (numero % 2 == 0)
            {
                mensagem = mensagem + "o numero..: "+numero+" = par\n";
                conta = conta +1;

            }
            numero = numero + 1;
        }
        JOptionPane.showMessageDialog(null,"mesangem..:"+mensagem);
    }
}
package Neri;

import javax.swing.*;

public class ParImpar006 {
    public static void main(String[] args) {
        int par =0, impar =0, numeroInicial,numeroFinal,i;
        numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("digite o numero inicial...: "));
           i = numeroInicial;

           do {
               numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("digite o numero final...; "));
               if (numeroFinal < numeroInicial)
                   JOptionPane.showMessageDialog(null,"numero final invalido, tem que ser maior do que..:"+numeroFinal);

            }
        while (numeroFinal < numeroInicial);

        while ( i <= numeroFinal)
        {
            if (i % 2 == 0)
                par++;
            else
                impar++;
            i++;

        }

      JOptionPane.showMessageDialog(null," \nentre o numero..:"+numeroInicial+
                                                                 " \neo numero..:"+numeroFinal+
                                                                            "\n existem "+par+" pares e..:\n "
                                                                                    +impar+" impares..:");
    }
}

package Neri;

import javax.swing.*;

public class Numero {
    public static void main(String[] args) {
        int num, calculo, soma =0, i;
        for (i = 0;i <= 4; i++)
        {
           num = Integer.parseInt(JOptionPane.showInputDialog("digite "+i+"numeros..:"));
           if ((num >=0) && (num <=4))
               soma = soma + num;
           else {

               JOptionPane.showMessageDialog(null, "a soma do numero");
               i = i + 1;
        }
        calculo = soma;
        JOptionPane.showMessageDialog(null, "a soma do numero"+calculo);

    }


}

    }

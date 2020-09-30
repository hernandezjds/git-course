package Neri;

import javax.swing.*;

public class Primo {
    public static void main(String[] args) {
        int numero, contador, i;
        contador = 0;
        i = 2;

         numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero..:"));
         while (i < numero)

         { if (numero %  i == 0)
             contador = contador +1;
             i =i+1;
         }

       if (contador > 0)
           JOptionPane.showMessageDialog(null, "o numero "+numero+" - nao e primo..:");
       else
           JOptionPane.showMessageDialog(null, "o numero "+numero+" - e primo..:");
    }
}

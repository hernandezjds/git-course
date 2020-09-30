package Neri;

import javax.swing.*;

public class LerValores003 {
    public static void main(String[] args) {
        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog("digite A..:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("digite B..:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("digite CS..:"));

        if ((a <= b) && (b <=c))
            if (b <= c)

                JOptionPane.showMessageDialog(null, "em ordem crescente ficou..;"+a+"-"+b+"-"+c);

            else
                JOptionPane.showMessageDialog(null, "em ordem crescente ficou..;"+a+"-"+c+"-"+b);

            else if ((b <= a) && (a <= a))
                if (a <= c)
                    JOptionPane.showMessageDialog(null, "em ordem crescente ficou..;"+b+"-"+a+"-"+c);
            else
                    JOptionPane.showMessageDialog(null, "em ordem crescente ficou..;"+b+"-"+c+"-"+a);

            else if (a <= b)
                    JOptionPane.showMessageDialog(null, "em ordem crescente ficou..;"+c+"-"+a+"-"+b);
            else
                    JOptionPane.showMessageDialog(null, "em ordem crescente ficou..;"+c+"-"+b+"-"+a);



    }
}

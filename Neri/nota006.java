package Neri;

import javax.swing.*;

public class nota006 {

    public static void main(String[] args) {
        float nota=0, media, soma = 0;
        int i;


        for (i = 1; i <= 10; i++)
        {
            nota = Float.parseFloat(JOptionPane.showInputDialog("digite  " + i + " as notas...:"));
            if ((nota >= 0) && (nota <= 10))
                soma = soma + nota;
            else {

                JOptionPane.showMessageDialog(null, "nota invalida digite apena nosta de 0 a 10");
                i = i - 1;
            }

        }
        media = soma / 3;
        JOptionPane.showMessageDialog(null, "a media final e...:" + media);
       if (media >=7)
           JOptionPane.showMessageDialog(null,"aluno aprovado com louvor..:"+media);
       else
           JOptionPane.showMessageDialog(null, "aluno reprovado...:"+media);

    }
}

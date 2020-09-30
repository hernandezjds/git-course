package Neri;

import javax.swing.*;

public class media {
    public static void main(String[] args) {
        float nota, media, soma = 0;
        int i;
        for (i = 0; i <= 2; i++)

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



        if (media >=7)
            JOptionPane.showMessageDialog(null,"aluno aprovado com louvor..:"+media);
        else
            JOptionPane.showMessageDialog(null, "aluno reprovado...:"+media);

    }


}

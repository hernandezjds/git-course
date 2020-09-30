package Neri;

import javax.swing.*;

public class Avaliacao02 {
    public static void main(String[] args) {
        float prova1, prova2, prova3, mediaFinal;
        prova1 = Float.parseFloat(JOptionPane.showInputDialog("digite a nota..:1 = "));
        prova2 = Float.parseFloat(JOptionPane.showInputDialog("digite a nota..:2 = "));
        prova3 = Float.parseFloat(JOptionPane.showInputDialog("digite a nota..:3 = "));
        prova1 = prova1 * 2 / 10;
        prova2 = prova2 * 3 / 10;
        prova3 = prova3 * 5 / 10;
        mediaFinal = prova1 + prova2 + prova3;
        if (mediaFinal >= 6)
            JOptionPane.showMessageDialog(null, "aluno aprovado para o proximo semestre...:" + mediaFinal);
        else if (mediaFinal >= 4)

            JOptionPane.showMessageDialog(null, "aluno em recuperaçao para o proximo semestre...:" + mediaFinal);
        else
            JOptionPane.showMessageDialog(null, "aluno reprovado para o proximo semestre...:" + mediaFinal);

    }


}

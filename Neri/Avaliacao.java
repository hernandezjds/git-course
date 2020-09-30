package Neri;

import javax.swing.*;

public class Avaliacao {

    public static void main(String[] args) {
        float nota1 = 0, nota2 = 0, nota3 = 0, media;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "digite a primeira nota ..:" +nota1));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "digite a segunda nota ..:" +nota2));
        nota3= Float.parseFloat(JOptionPane.showInputDialog(null, "digite a terceira nota ..:" +nota3));

        media = nota1 + nota2 + nota3 /2;
        JOptionPane.showInputDialog(null, "a media final ="+media);
    }
}

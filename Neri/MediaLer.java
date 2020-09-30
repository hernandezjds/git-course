package Neri;

import javax.swing.*;

public class MediaLer {
    public static void main(String[] args) {
        float nota1, nota2, nota3, calcuMedia;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("digite a primeira nota:"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("digite a segunda  nota:"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("digite a terceira nota:"));
        calcuMedia = (nota1 + nota2 + nota3) / 2;
        System.out.println("a media =" + calcuMedia);
        JOptionPane.showMessageDialog(null,"A media ="+calcuMedia);


    }
}

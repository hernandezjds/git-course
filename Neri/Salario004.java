package Neri;

import javax.swing.*;

public class Salario004 {
    public static void main(String[] args) {
        float salario, novoSal;
        salario = Float.parseFloat(JOptionPane.showInputDialog("digite seu salario...:"));

            if (salario >= 500) {
                novoSal = salario * 0.2f;

            } else {
                novoSal =salario * 0.1f;


            }
            novoSal = salario + novoSal;
        JOptionPane.showMessageDialog(null, "novo salario ..:" + novoSal);

    }

}

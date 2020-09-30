package LIVRO.Parte001.ParteIF;

import javax.swing.*;
import java.util.Scanner;

public class CalcularQuarto {
    public static void main(String[] args) {

        int n1,n2,n3,n4,soma;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite quatro numero");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        n4 = entrada.nextInt();
        soma = n1+n2+n3+n4;
        System.out.println("soma = "+soma);
        JOptionPane.showMessageDialog(null,"soma dos numeros é...:"+soma);
    }

}

package LIVRO.Parte001.ParteIF;

import javax.swing.*;
import java.util.Scanner;

public class TaxaJuros {
    public static void main(String[] args) {
        float deposito,taxa,rendimento;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o valor do deposito");
        deposito = entrada.nextFloat();
        System.out.println("digite taxa de juros..:");
        taxa = entrada.nextFloat();
        taxa = deposito * taxa /100;
        rendimento = deposito +taxa;
        System.out.println("valor do rendimento e...:"+rendimento);
        JOptionPane.showMessageDialog(null, "valor do rendimento..:"+rendimento);

    }
}

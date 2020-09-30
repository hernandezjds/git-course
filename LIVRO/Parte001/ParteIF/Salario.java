package LIVRO.Parte001.ParteIF;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        float salario , aumento, valoraum,imposto;
        Scanner entrada;
        entrada = new Scanner(System.in);
        DecimalFormat casa;
        casa = new DecimalFormat("0.00");
        System.out.println("digite salario da pessoa...:");
        salario = entrada.nextFloat();
        System.out.println("digite porcetagem que sera aplicada ao salario");
        valoraum = entrada.nextFloat();

        aumento = salario + salario * valoraum /100;
        imposto = salario * 7 /100;
        aumento = salario + valoraum - imposto;
        System.out.println("valor salario com aumento de "+valoraum+"%..:"+aumento+"valor descontado de imposto..:"+imposto);
        JOptionPane.showMessageDialog(null, "valor salario com aumento de"+valoraum+" %..:"+aumento+"\nvalor descontado de imposto..:"+imposto);



    }
}

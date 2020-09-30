package LIVRO.Parte001.ParteIF;

import javax.swing.*;
import java.util.Scanner;

public class Salario002 {
    public static void main(String[] args) {
        float salario,imposto,salarioBase;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o salario do funcionario..:");
        salario = entrada.nextFloat();
        imposto = salario* 10 /100;
        salarioBase = salario + 50 - imposto;
        System.out.println("salario final do funcionario e ..:"+salarioBase);
        JOptionPane.showMessageDialog(null, "salario final do funcionario e ..:"+salarioBase );


    }
}

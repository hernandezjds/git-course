package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        double precoFabrica, lucroEmpresa, imposto, precoFinal;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o preço de fabrica..: = ");
        precoFabrica = entrada.nextDouble();
        System.out.println("digite percentual de lucro empresa..: = ");
        lucroEmpresa = entrada.nextDouble();
        System.out.println("digite o percentual de imposto..: = ");
        imposto = entrada.nextDouble();
        lucroEmpresa = precoFabrica * lucroEmpresa /100;
        imposto = precoFabrica * imposto /100;
        precoFinal = precoFabrica + lucroEmpresa + imposto;
        System.out.println("percentual de lucro empresa..: = "+lucroEmpresa);
        System.out.println("percentual de imposto..: = "+imposto);
        System.out.println("valor final do carro e..: = "+precoFinal);

    }
}

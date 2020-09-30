package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Carga {
    public static void main(String[] args) {
        int peso, preçoCarga,imposto,valortotal,codigoCarga =0, tonelada, codigoPais =0;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o código do produto, um número entre 10 a 20");
        preçoCarga = entrada.nextInt();
        System.out.println("Digite o código do estado, um número entre 1 a 5");
        codigoPais = entrada.nextInt();
        System.out.println(" Digite o peso do produto em tonelada..:");
        tonelada= entrada.nextInt();
        peso = tonelada * 1000;
        System.out.println("o peso  da carga convertido para kg..:"+peso);


        if (codigoCarga >= 10 && codigoCarga <= 20) {
            preçoCarga = 100 * peso;
           if (codigoCarga >= 21 && codigoCarga <= 30)
                preçoCarga = 250 * peso;
            else if (codigoCarga >= 31 && codigoCarga <= 40)
               preçoCarga = 350 * peso;
            System.out.println("o preço  da carga convertido para kg..:"+preçoCarga);
        }
        if (codigoPais == 1) {
            imposto = preçoCarga * 35 / 100;
            if (codigoPais == 2)
                imposto = preçoCarga * 25/ 100;
            if (codigoPais == 3)
                imposto = preçoCarga *  15/ 100;
            if (codigoPais == 4)
                imposto = preçoCarga * 5/ 100;
            if (codigoPais == 5)
                imposto =0;
            System.out.println("Valor do imposto = "+imposto);
            valortotal = preçoCarga + imposto;
            System.out.println("valor final da carga..:"+valortotal);
        }






    }
}

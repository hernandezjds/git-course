package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Gato {
    public static void main(String[] args) {
        float gato1, gato2, sacoRacao, restaraRacao;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("peso do saco de ração..: (kg) = ");
        sacoRacao = entrada.nextFloat();
        System.out.println("quantidade de ração diaria..:(gramas) = ");
        gato1 = entrada.nextFloat();
        System.out.println("quantidade de ração diaria..:(gramas) = ");
        gato2 = entrada.nextFloat();
        gato1 = gato1 /1000;
        gato2 = gato2 /1000;

       restaraRacao = sacoRacao - 5 * (gato1 + gato2);
        System.out.println("restarao apos 5 dias..: = " +restaraRacao);

    }
}

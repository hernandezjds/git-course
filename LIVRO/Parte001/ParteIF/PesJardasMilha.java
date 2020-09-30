package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class PesJardasMilha {
    public static void main(String[] args) {
        double pes, polegadas, jarda, milha;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite o valor em pes..: = ");
        pes = entrada.nextDouble();
        polegadas = pes * 12;
        jarda = pes / 3;
        milha = pes / 1.760;
        System.out.println("o valor de polegadas..: = "+polegadas);
        System.out.println("o valor de jarda..: = "+jarda);
        System.out.println("o valor de milhas..: = "+milha);

    }

}

package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int nascimento, anoAtual,anoFuturo, idade;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite ano de nascimento..: = ");
        nascimento = entrada.nextInt();
        System.out.println("digite ano atual..: = ");
        anoAtual = entrada.nextInt();
        idade =  anoAtual - nascimento;
        System.out.println("sua idade e..: = "+idade);
        anoFuturo =  2050 - nascimento;
        System.out.println("em 2050 vc tera a idade de ..: = "+anoFuturo);

    }
}

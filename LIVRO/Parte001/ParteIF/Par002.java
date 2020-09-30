package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Par002 {
    public static void main(String[] args) {
        int par;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite  numeros..: = ");
        par = entrada.nextInt();

        if (par % 2 == 0)
            System.out.println("numero par..: = "+par);
        else
            System.out.println("numero impar..: = "+par);


    }

}

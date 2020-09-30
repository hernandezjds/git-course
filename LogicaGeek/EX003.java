package LogicaGeek;

import java.util.Scanner;

public class EX003 {
    public static void main(String[] args) {
        int extra, numerohoas, salario, exceder=0;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("numero de horas trabalhada..:");
        numerohoas = entrada.nextInt();
        if (numerohoas >50)
            exceder = numerohoas - 50;
            numerohoas = numerohoas - exceder;
            extra = exceder *20;
            salario = numerohoas * 10;
        System.out.println("salario do trabalhado..:"+salario);
        System.out.println("numeros de horas extras..: "+extra);
    }
}

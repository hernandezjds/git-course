package LogicaGeek;

import java.util.Scanner;

public class EX002 {
    public static void main(String[] args) {
        double numero;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite um numero positivo o negativo..:");
        numero = entrada.nextDouble();
        if (numero >0)
            System.out.println("numero positivo..:");
        else
        System.out.println("numero negativo..:");
    }
}

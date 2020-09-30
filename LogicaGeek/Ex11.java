package LogicaGeek;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite um numero ..:");
        numero = entrada.nextInt();
        if (numero % 2 ==0)
        System.out.println("numero par..:");
        else
            System.out.println("numero impar..:");


    }
}

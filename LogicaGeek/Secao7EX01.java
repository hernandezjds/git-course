package LogicaGeek;

import java.util.Scanner;

public class Secao7EX01 {
    public static void main(String[] args) {
        int numero, maior = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um numero..:");
        numero = entrada.nextInt();
        while (numero!= 0){
            if (numero > maior){
                maior = numero;
            }
            System.out.println("informe um numero..:");
            numero = entrada.nextInt();
        }
        System.out.println("informe um numero..:"+maior);
        entrada.close();
    }
}

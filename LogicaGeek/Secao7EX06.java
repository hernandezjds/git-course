package LogicaGeek;

import java.util.Scanner;

public class Secao7EX06 {
    public static void main(String[] args) {
        int numero, i;
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe um numero 1 a 10..:");
        numero = teclado.nextInt();
        while (numero < 1 || numero >10){
             System.out.println("informe um numero 1 a 10.:");
             numero = teclado.nextInt();

        }
        for (i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n",numero,i,(numero *i));
        }
        teclado.close();

    }
}

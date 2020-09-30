package Logica2020;

import java.util.Scanner;

public class menosTres {
    public static void main(String[] args) {
        int a, b, c, menor;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite numero um :");
        a = dados.nextInt();
        System.out.println("digite numero dois :");
        b = dados.nextInt();
        System.out.println("digite numero tres :");
        c = dados.nextInt();

        if (a < b && a < c) {
            menor = a;
        }
        else if (b < c) {
            menor = b;
        }
        else {
            menor = c;
        }

        System.out.printf("MENOR = %d\n", menor);

        dados.close();



    }
}

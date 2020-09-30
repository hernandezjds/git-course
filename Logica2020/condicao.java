package Logica2020;

import java.util.Scanner;

public class condicao {
    public static void main(String[] args) {
        int horas;

        Scanner dados = new Scanner(System.in);
        System.out.println("digite a horas..:");
        horas = dados.nextInt();

        if   (horas < 12)
              System.out.println("bom dia");
        else
            if  (horas < 18)
              System.out.println("boa tarde");
       else
              System.out.println("boa noite");
    }
}

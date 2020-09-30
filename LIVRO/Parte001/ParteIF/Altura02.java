package LIVRO.Parte001.ParteIF;

import java.util.Scanner;

public class Altura02 {
    public static void main(String[] args) {
       Float altura, peso;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite altura da pessoa..:");
        altura = entrada.nextFloat();
        System.out.println("digite o peso da pessoa..:");
        peso = entrada.nextFloat();
        if (altura < 120 )
        {
            if  (peso <= 60)
            System.out.println("grupo A.:");
            if  (peso > 60 && peso <=90)
            System.out.println("grupo D.:");
            if  (peso > 90)
            System.out.println("grupo G.:");
        }
        if (altura >= 1.20 && altura <= 1.70)
        {

            if  (peso <= 60)
            System.out.println("grupo B.:");
            if  (peso > 60 && peso <=90)
            System.out.println("grupo E.:");
            if  (peso > 90)
            System.out.println("grupo H.:");
        }
        if (altura > 170)
        {
            if  (peso <= 60)
            System.out.println("grupo C.:");
            if  (peso > 60 && peso <=90)
            System.out.println("grupo F.:");
            if  (peso > 90)
            System.out.println("grupo I.:");
        }




    }
}

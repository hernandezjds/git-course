package Logica2020;

import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        double minuto, franquia=0, valorPagar=50;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite os minuntos..:");
        minuto = dados.nextDouble();
        /*
        nao precisava deste if
        if (minuto <= 100)
            System.out.println("valor a pagar é de :"+valorPagar);
        else {*/
            if
            (minuto > 100)
                franquia = minuto - 100;
            franquia = franquia * 2;
            valorPagar = 50 + franquia;
            /*
            poderia ter feito deste jeito em uma so equaçao
            valorPagar = 50 + 2 * (minuto - 100)

             */
            System.out.println("valor a pagar :" + valorPagar);
        }



    }


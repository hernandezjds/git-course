package Logica2020;

import java.util.Scanner;

public class dardo {
    public static void main(String[] args) {
        double distancia1, distancia2, distancia3, maior;
        Scanner dados = new Scanner(System.in);
        System.out.println("medida da primeira tentativa.:");
        distancia1 = dados.nextDouble();
        System.out.println("medida da segunda tentativa.:");
        distancia2 = dados.nextDouble();
        System.out.println("medida da terceira tentativa.:");
        distancia3 = dados.nextDouble();
        /*
         System.out.println("Digite as tres distancias:");
	    distancia1 = sc.nextDouble();
	    distancia2 = sc.nextDouble();
	    distancia3 = sc.nextDouble();
         */


        if (distancia1 > distancia2 && distancia1 > distancia3){
            maior = distancia1;
        }
        else if (distancia2 > distancia3) {
            maior = distancia2;
        }
        else {
            maior = distancia3;
        }
        System.out.println("a distancia maior = " +maior);

        dados.close();
    }
}

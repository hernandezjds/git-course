package Logica2020;

import java.util.Scanner;

public class temperaturaConversao {
    public static void main(String[] args) {
        double celsius, kelvin, fahrenheit, conversao;
        char letra;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite uma temperatura para conversao.:");
        conversao = dados.nextDouble();
        System.out.printf("digite uma letra  a = celsius b = fahrenheit c= kelvin d = kelvin para celsius..:");
        letra = dados.next().charAt(0);
        if (letra == 'a') {
            fahrenheit = conversao * 9.0 / 5.0 + 32.0;
            ;
            System.out.println("a conversao de celsius para fahrenheit e de =" + fahrenheit + " fahrenheit");
        } else if (letra == 'b') {
            celsius = 5.0 / 9.0 * (conversao - 32.0);
            System.out.println("a conversao de fahrenheit para celsius  e de =" + celsius + " celsius");

        } else if (letra == 'c') {
            kelvin = conversao + 273.15;
            System.out.println("a conversao de celsius para  kelvin e de =" + kelvin + " kelvin");

        } else if (letra == 'd') {
            celsius = conversao - 273.15;
            System.out.println("a conversao de kelvin para celsius  e de =" + celsius + " celsius");

        }


    }
}

package Logica2020;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int h, b,B,area;
        Scanner dados =  new Scanner(System.in);
        System.out.println("digite o valor de H..:");
        h = dados.nextInt();
        System.out.println("digite o valor de B..:");
        B = dados.nextInt();
        System.out.println("digite o valor de b..:");
        b = dados.nextInt();
        area = (b + B) / 2 * h;
        System.out.println("o valor da area é..:" + area);
    }
}

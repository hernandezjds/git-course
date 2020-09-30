package LogicaGeek;

import java.util.Scanner;

public class EX007 {
    public static void main(String[] args) {
      float base=2, n1,n2,n3,n4,qu1, qu2, qu3, qu4;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite um numero..:");
        n1= entrada.nextFloat();
        System.out.println("digite um numero..:");
        n2= entrada.nextFloat();
        System.out.println("digite um numero..:");
        n3= entrada.nextFloat();
        System.out.println("digite um numero..:");
        n4= entrada.nextFloat();
        qu1 = n1 * base;
        qu2 = n2 * base;
        qu3 = n3 * base;
        qu4 = n4 * base;
        if(qu3 >= 10000) {
            //saída
            System.out.println(qu3);
        }else {
            //saídas
            System.out.println(" Num1 :  Quadrado 1 : \n" +n1 +qu1);
            System.out.println(" Num2 :  Quadrado 2 : \n" +n2 +qu2);
            System.out.println(" Num3 :  Quadrado 3 : \n" +n3 +qu3);
            System.out.println(" Num4 :  Quadrado 4 : \n" +n4 +qu4);
        }
        entrada.close();

    }
}

package LogicaGeek;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int peso, excesso=0, multa;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite niveis de peso do peixe..:");
        peso = entrada.nextInt();
        if (peso > 50)
            excesso = peso - 50;
            multa = excesso * 4;

        System.out.println("peso..:"+peso);
        System.out.println("excesso..:"+excesso);
        System.out.println("multa..:"+multa);
    }
}

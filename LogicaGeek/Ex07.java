package LogicaGeek;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int idade;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite a idade..:");
        idade = entrada.nextInt();
        if ((idade >= 5) && (idade <7))
            System.out.println("categoria infantil A..:");
        if ((idade >= 8) && (idade <11))
            System.out.println("categoria infantil B..:");
        if ((idade >= 12) && (idade < 13))
            System.out.println("categoria juvenil A..:");
        if ((idade >= 14) && (idade < 17))
            System.out.println("categoria juvenil B..:");
        if (idade > 18)
            System.out.println("categoria adultos..:");

    }
}

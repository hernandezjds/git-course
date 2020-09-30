package LogicaGeek;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        float poluicao;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite niveis de poluicao");
        poluicao = entrada.nextFloat();
        if ((poluicao >= 0.3 ) && (poluicao < 0.4))
            System.out.println("grupo 1 suspender atividade..:");
        else if ((poluicao >= 0.4 ) && (poluicao < 0.5))
        System.out.println("grupo 2 e 1 suspender atividade..:");
        else if  (poluicao >= 0.5)
        System.out.println("todos os grupo suspender atividade..:");
        else
            System.out.println("niveis aceitaveis..:");

    }
}

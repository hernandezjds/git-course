package LogicaGeek;

import java.util.Scanner;

public class Secao7EX07 {
    public static void main(String[] args) {
        int contadorTotal=0, contadorSituacao01 = 0,contadorSituacao02 = 0,contadorSituacao03 = 0,
                contadorSituacao04 = 0,identificador,defeito;
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe a identificação..: ");
        identificador = teclado.nextInt();
        while (identificador !=0) {
            System.out.println("1 - necessita de esfera..: ");
            System.out.println("2 - necessita de limpeza..: ");
            System.out.println("troca de cabo.: ");
            System.out.println("quebrado..: ");
            defeito = teclado.nextInt();
            if (defeito == 1){
                contadorSituacao01 = contadorSituacao01 +1;
            }
            if (defeito == 1){
                contadorSituacao02 = contadorSituacao02 +1;
            }
            if (defeito == 1){
                contadorSituacao03 = contadorSituacao03 +1;
            }
            if (defeito == 1){
                contadorSituacao04 = contadorSituacao04 +1;
            }
              contadorTotal = contadorTotal + 1;
            System.out.println("informe a identificação..: ");
            identificador = teclado.nextInt();

        }
         float p1,p2,p3,p4;
        p1 = ((float) contadorSituacao01 / (float)contadorTotal) * (float)100;
        p2 = ((float) contadorSituacao02 / (float)contadorTotal) * (float)100;
        p3 = ((float) contadorSituacao03 / (float)contadorTotal) * (float)100;
        p4 = ((float) contadorSituacao04 / (float)contadorTotal) * (float)100;
        System.out.printf("Quantidade de mouses %d\n", contadorTotal);
        System.out.println("Situação \t\t\t\tQuantidade \tPercentual");
        System.out.printf("1-Necessidade de esfera \t\t\t%d \t\t%.2f%%\n", contadorSituacao01, p1);
        System.out.printf("2-Necessidade de limpeza \t\t\t%d \t\t%.2f%%\n", contadorSituacao02, p2);
        System.out.printf("3-Necessita troca do cabo ou conector \t\t%d \t\t%.2f%%\n", contadorSituacao03, p3);
        System.out.printf("4-Quebrado ou inutilizado \t\t\t%d \t\t%.2f%%\n", contadorSituacao04, p4);
        teclado.close();
    }
}

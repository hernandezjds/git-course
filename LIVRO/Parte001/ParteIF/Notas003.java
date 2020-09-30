package LIVRO.Parte001.ParteIF;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Notas003 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, media, notaExame;
        Scanner entrada;
        DecimalFormat casas;
        casas = new DecimalFormat ("0.00");
        entrada = new Scanner(System.in);
        System.out.println("digite a primeira nota");
        nota1 = entrada.nextInt();
        System.out.println("digite a segunda nota");
        nota2 = entrada.nextInt();
        System.out.println("digite a terceira nota");
        nota3 = entrada.nextInt();
        media = nota1 + nota2 + nota3 /3;
        System.out.println("media aritimetica..: = "+casas.format(media));
        if (media >=0 && media <=3)
            System.out.println("aluno reprovado..: = ");
        else if (media >=3 && media <=7)
            System.out.println(" aluno para exame..: = ");
            notaExame = 12 - media;
        System.out.println("deve tirar nota " + casas.format(notaExame)+ "= para ser aprovado");
        if(media >=7 && media <=10)
        System.out.println(" aluno  aprovado..: = ");
    }
}

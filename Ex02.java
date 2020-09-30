import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        float altura, peso = 0;
        char sexo;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("digite a sua altura..:");
        altura = entrada.nextFloat();
        System.out.println("digite sexo (M)homens (F)mulher..:");
        sexo = entrada.next().charAt(0);
        if ((sexo == 'M') || (sexo == 'm')) {
            peso = (72.7f * altura) - 44.0f;
            System.out.println("seu peso ideal é..:" + peso);
        }

            if ((sexo == 'F') || (sexo == 'f')) {
                peso = (62.1f * altura) - 44.0f;
                System.out.println("seu peso ideal é..:" + peso);
            }


        }
    }


package Neri;

public class imposto {


    public static void main(String[] args) {
        double salario = 5000.00;
        double resultado = salario * 0.3;
        double valorFinal = salario - resultado;
        System.out.println("30%  o desconto foi:" + resultado);
        resultado = salario * 0.15;
        System.out.println("15%  o desconto foi:" + resultado);
        resultado = salario * 0.05;
        System.out.println("0.05% o desconto foi:" + resultado);


        System.out.println("30%  o valor final foi:" +valorFinal);
        valorFinal = salario - resultado;
        System.out.println("15%  o valor final:" +valorFinal);
        valorFinal = salario - resultado;
        System.out.println("0.05% o valor final:" +valorFinal);
        valorFinal = salario - resultado;
    }


}

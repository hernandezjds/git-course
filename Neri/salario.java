package Neri;

//crie um classe que calcule uma porcentagem de um Neri.salario
public class salario {
    public static void main(String[] args) {
       float pagamento = 5000.00f;
        float porcentagem1 = 30f;
        float porcentagem2= 15f;
        float porcentagem3 = 0.5f;
        float valorDesconto1 = pagamento * (porcentagem1 /100);
        float valorDesconto2 = pagamento * (porcentagem2 /100);
        float valorDesconto3 = pagamento * (porcentagem3 /100);
        float valorFinal1 = pagamento - valorDesconto1;
        float valorFinal2 = pagamento - valorDesconto2;
        float valorFinal3 = pagamento - valorDesconto3;
        System.out.println("o valor do desconto foi de  :" + valorDesconto1);
        System.out.println("o valor do desconto foi de  :" + valorDesconto2);
        System.out.println("o valor do desconto foi de  :" + valorDesconto3);
        System.out.println("o valor que vc vai recebe é :" + valorFinal1);
        System.out.println("o valor que vc vai recebe é :" + valorFinal2);
        System.out.println("o valor que vc vai recebe é :" + valorFinal3);


    }
}
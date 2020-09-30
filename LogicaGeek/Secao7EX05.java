package LogicaGeek;

import java.util.Scanner;

public class Secao7EX05 {
    public static void main(String[] args) {
        String nome, senha;
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o nome: ");
        nome = teclado.next();
        System.out.println("informe a senha: ");
        senha = teclado.next();
        while (nome.equals(senha)){
            System.out.println("erro nome igual senha:");
            System.out.println("informe o nome: ");
            nome = teclado.next();
            System.out.println("informe a senha: ");
            senha = teclado.next();

        }
        teclado.close();
    }
}

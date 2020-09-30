package Neri;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4100.50f;
        float resultado = 0f;
        String porcentagem = "";
        if (salario > 4500) {
            resultado = salario * 0.3f;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.1f;
            porcentagem = "10%";
        }
        System.out.println("o valor final em porcentagem de " +porcentagem+"é de "+resultado);
    }
}

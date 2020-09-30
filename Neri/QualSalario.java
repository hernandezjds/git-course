package Neri;

public class QualSalario {
    public static void main(String[] args) {

        float salario = 4700.50f;
        float resultado = salario * 0.3f;
        if (salario > 4500) {
            float trintaPorcento = salario * 0.3f;
            System.out.println("30% = " + resultado);
        } else {
            float dezPorcento = salario * 0.1f;
            System.out.println("10% =" + resultado);
        }


    }
}

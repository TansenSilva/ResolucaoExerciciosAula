package lista02.exercicio3;

import java.util.Scanner;

public class CalculadoraSalarioMinimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário: ");
        double salario = input.nextDouble();
        double salarioMinimo = 1212;
        double qtdSalarioMinimo = salario / salarioMinimo;

        input.close();

        System.out.printf("Você ganha %.1f de salários mínimos em 2022.", qtdSalarioMinimo);
    }
}

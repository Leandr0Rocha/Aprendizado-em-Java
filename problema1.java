/*Programa que calcula um imposto de renda fictício com base no salário da pessoa, quanto mais alto o salário, maior o valor do imposto.
O programa pede para que o usuário digite o salário e retorna o valor cobrado pelo imposto sobre o salário.
Resolução do problema 1051 da plataforma Beecrowd*/

import java.io.IOException;
import java.util.Scanner;

public class problema1 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu salario, por favor:");
        double salario = leitor.nextDouble();
        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000) {
            System.out.println(String.format("R$ %.2f", (salario - 2000) * 0.08));
        } else if (salario > 3000 && salario <= 4500) {
            System.out.println(String.format("R$ %.2f", ((salario - 3000) * 0.18) + 80));
        } else {
            System.out.println(String.format("R$ %.2f", ((salario - 4500) * 0.28) + 350));
            leitor.close();
        }
    }
}

/*Programa que cria uma lista numérica, calcula a média entre os termos e mostra os que estão abaixo da média.
É pedida a digitação do tamanho da lista e a digitação dos termos espaçados.
Resolução de problema do "Curso Completo de Lógica de Programação usando Java", do Professor Dr. Nelio Alves*/

import java.util.Scanner;

public class programa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da lista:");
        int N = sc.nextInt();
        System.out.println("Digite os termos da lista com um espaco entre cada:");
        double[] a = new double[N];
        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            soma = a[i] + soma;
            }
        double media = soma / N;
        System.out.println("Media aritmetica:");
        System.out.printf("%.3f%n", media);
        System.out.println("Termos que estao abaixo da media:");
        for(double i : a){
            if(i < media){
                System.out.printf("%.1f%n", i);
            }
        }
        
        sc.close();
    }
}


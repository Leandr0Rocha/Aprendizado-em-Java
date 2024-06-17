/*Programa que cria uma matriz C a partir da soma dos termos em posições iguais em duas matrizes A e B. 
É pedida a digitação do  número de linhas e de colunas, que deve ser igual nas três matrizes, 
então é pedida a digitação das duas matrizes que serão somadas, separando cada termo com um espaço e cada linha com um parágrafo.
Resolução de problema do "Curso Completo de Lógica de Programação usando Java", do Professor Dr. Nelio Alves*/

import java.util.Scanner;

public class problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de linhas e colunas das matrizes, com um espaco entre eles:");
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] a = new int[M][N];
        int[][] b = new int[M][N];
        int[][] c = new int[M][N];
        System.out.println("Digite a primeira matriz, separando cada termo com espaco e cada linha com um paragrafo:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite a segunda matriz, separando cada termo com espaco e cada linha com um paragrafo:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                c[i][j] = a[i][j] + b[i][j];
                }
            }
        System.out.println("Matriz resultante:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
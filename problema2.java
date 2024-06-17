/*Programa que classifica uma série de numerais em PAR ou IMPAR e POSITIVO ou NEGATIVO. 
É requerida a digitação da quantidade de números que serão analisados e a digitação desses números em seguida.
Resolução do problema 1074 da plataforma Beecrowd*/

import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de algarismos que deseja testar:");
        int n = sc.nextInt();
        String cond1 = "";
        String cond2 = "";
		System.out.println("Digite os algarismos, pulando linha entre cada um.");
                for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x % 2 == 0 && x > 0){
                cond1 = "PAR";
                cond2 = "POSITIVO";
                System.out.println(cond1 + " " + cond2);
            }else if(x % 2 == 0 && x < 0){
                cond1 = "PAR";
                cond2 = "NEGATIVO";
                System.out.println(cond1 + " " + cond2); 
            }else if(x % 2 != 0 && x > 0){
                cond1 = "IMPAR";
                cond2 = "POSITIVO";
                System.out.println(cond1 + " " + cond2);
            }else if(x % 2 != 0 && x < 0){
                cond1 = "IMPAR";
                cond2 = "NEGATIVO";
                System.out.println(cond1 + " " + cond2);
            }else if(x == 0){
                cond1 = "";
                cond2 = "NULL";
                System.out.println(cond2);
            }}

        sc.close();
    }
}
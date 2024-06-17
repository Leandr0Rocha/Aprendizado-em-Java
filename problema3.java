/*Programa que calcula todos os divisores de um numeral.
É pedida a digitação do numeral e a saída mostra uma lista de divisores.
Resolução do problema 1157 da plataforma Beecrowd*/

import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numeral a ser analisado:");
        int n = sc.nextInt();
		for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
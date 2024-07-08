// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
package exercicios;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite un valor inteiro: ");
        int num01 = scan.nextInt();
        
        if (num01 < 0) {
            System.err.println("NEGATIVO");
            
        }else {
            System.err.println("NÃO NEGATIVO");
        }

    }

}

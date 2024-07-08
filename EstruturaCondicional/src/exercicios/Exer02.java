// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
package exercicios;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int  num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");          

        }else {
            System.out.println("IMPAR");
        }
        scan.close();

    }

}

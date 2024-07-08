/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
package exercicios;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Peça 01
        System.out.println("Digite o código da peça 1: ");
        int cod01 = scan.nextInt();
        System.out.println("O número de peças 1: ");
        int qtde01 = scan.nextInt();
        System.out.println("Digite o valor da peça 01: R$");
        float valor01 = scan.nextFloat();

        float total01 = qtde01 * valor01;

        // Peça 02
        System.out.println("Digite o código da peça 2: ");
        int cod02 = scan.nextInt();
        System.out.println("O número de peças 2: ");
        int qtde02 = scan.nextInt();
        System.out.println("Digite o valor da peça 02: R$");
        float valor02 = scan.nextFloat();
        
        float total02 = qtde02 * valor02;

        // Soma total

        float totalPagar = total01 + total02;
        
        
        System.out.printf("TOTAL A PAGAR: R$ %.2f",totalPagar);
        
    }

}

/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar. */
package exercicios;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("CODIGO          ESPECIFICAÇÃO           PREÇO");
        System.out.println("-----------------------------------------------");
        System.out.println("  1             Cachorro-Quente         R$ 4,00");
        System.out.println("  2             X-Salada                R$ 4,50");
        System.out.println("  3             X-Bacon                 R$ 5,00");
        System.out.println("  4             Torrada Simples         R$ 2,00");
        System.out.println("  5             Refrigerante            R$ 1,50");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Digite o código do pedido: ");
        int codigo = scan.nextInt();

        System.out.println("Digite a quantidade desejada: ");
        int quantidade = scan.nextInt();

        double valorTotal = 0.00;


        if (codigo == 1) {
            valorTotal = quantidade * 4.00;
        
                       
        }
        else if (codigo == 2) {
            valorTotal = quantidade * 4.50;
            
        
        }
        else if (codigo == 3) {
            valorTotal = quantidade * 5.00;
           

        }
        else if (codigo == 4){
            valorTotal = quantidade * 2.00;
           
        }
        else if (codigo == 5) {
            valorTotal = quantidade * 1.50;
            
        } else {
            System.out.println("Código inválido");
            System.exit(0);
        }
        System.out.printf("TOTAL: R$ %.2f", valorTotal);   
        scan.close(); 

    }

}

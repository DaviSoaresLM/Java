/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */
package exercicios;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 2 valores inteiros: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
            
        }else {
            System.out.println("Não são múltiplos");
        }
        scan.close();
    }

}

/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

package exercicios;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = scan.nextInt();

        while(senha != 2002){
            System.out.println("Senha inválida");
            senha = scan.nextInt();
        }
        scan.close();
        System.out.println("Senha válida!");
        


    }

}

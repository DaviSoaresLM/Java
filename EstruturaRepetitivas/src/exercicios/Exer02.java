/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */

package exercicios;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scan.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = scan.nextInt();

        while(x != 0 && y != 0){
            if(x> 0 && y > 0){
                System.out.println("Primeiro"); 
                break;
            } else if(x < 0 && y > 0){
                System.out.println("Segundo");
                break;

            } else if(x< 0 && y < 0){
                System.out.println("Terceiro");
                break;
            } else if(x > 0 && y < 0){
                System.out.println("Quarto");
                break;
            } else{
                x = scan.nextInt();
                y = scan.nextInt();
            }
        }
    }
}

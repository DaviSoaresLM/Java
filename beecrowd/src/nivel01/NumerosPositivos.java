/* Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos. */

import java.util.Scanner;
public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador=1;
        int contagem=0;
        while(contador<=6){
            double numero = scan.nextDouble();
            if(numero>0){
                contagem++;
            }       
            contador++;   
        }
        System.out.printf("%d valores positivos%n",contagem);
    }
}
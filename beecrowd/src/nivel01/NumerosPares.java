/* Faça um programa que mostre os números pares entre 1 e 100, inclusive.

Entrada
Neste problema extremamente simples de repetição não há entrada.

Saída
Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha. */

public class NumerosPares {
    public static void main(String[] args) {
        int contador = 1;
        while(contador <= 100) {
            if(contador%2==0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
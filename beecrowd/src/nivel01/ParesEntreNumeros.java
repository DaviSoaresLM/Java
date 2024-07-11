
/* Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos. */
import java.util.Scanner;
public class ParesEntreNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador=1;
        int contagem=0;
        while(contador<=5){
            int numero = scan.nextInt();
                if(numero%2==0){
                    contagem++;
                }      
            contador++;   
        }
        System.out.printf("%d valores pares%n",contagem);
        scan.close();
    }
}
/* Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido. */

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempo = scan.nextInt();
        int horas = tempo/3600;
        int minutos = (tempo%3600)/60;
        int segundos = tempo%60;
        System.out.printf("%d:%d:%d%n",horas,minutos,segundos);
    }
}
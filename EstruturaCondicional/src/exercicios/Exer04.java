/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
package exercicios;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a hora inicial: ");
        int horaIni = scan.nextInt();

        System.out.println("Digite a hora finalL: ");
        int horaFinal = scan.nextInt();

        int duracao;

        if (horaFinal > horaIni ){
            duracao = horaFinal - horaIni;
        } else {
            duracao = (24 - horaIni) + horaFinal;
        }
        System.out.printf("O JOGO DUROU %d HORAS",duracao);
    }

}

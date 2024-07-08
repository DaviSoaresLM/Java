/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */
package exercicios;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");
        int num = scan.nextInt();

        System.out.println("Digite as horas trabalhadas: ");
        int horas = scan.nextInt();

        System.out.println("Valor que recebe por hora: ");
        float valorHora = scan.nextFloat();

        float salario = horas * valorHora;

        System.out.printf("Número = %d%nSalário = R$ %.2f",num,salario);

        scan.close();

    }

}

/* Faça um programa para ler o valor do raio de um círculo,e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.Fórmula da área:area=π.raio2 Considere o valor de π=3.14159 */

package exercicios;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        double raio = scan.nextDouble();

        double area = pi * (raio * raio);

        System.out.printf("A área é: %.4f", area);

        scan.close();

    }

}
